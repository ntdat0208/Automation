package com.logigear.selenium;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.logigear.qtium.QTiumNavigator;
import com.logigear.qtium.driver.QTiumDriverManager;
import com.logigear.qtium.driver.QTiumWebDriver;

import java.util.Properties;
import java.util.Random;

import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class QTiumAutomation {

	private static QTiumWebDriver getQTiumWebDriver() {
		return QTiumDriverManager.getQTiumDriver();
	}

	public static RemoteWebDriver getDriver() {
		return getQTiumWebDriver().getWebDriver();
	}

	public static int countElements(By element) throws Exception {
		return findElements(element).size();
	}

	public static int randomNumberFromList(List<Integer> list) throws Exception {
		int index = new Random().nextInt(list.size());
		return list.get(index);
	}

	public static int randomIntNumber(int range) {
		Random random = new Random();
		return random.nextInt(range) + 1;
	}

	public static void dismissAlert() {
		System.out.println("> dismissing Alert...");
		if (isAlertDisplayed())
			getDriver().switchTo().alert().accept();
	}

	public static String getCurrentUrl() throws Exception {
		waitForPageToBeReady();
		return getDriver().getCurrentUrl();
	}

	public static boolean isStringContainsText(String string, String text) {
		return string.contains(text);
	}

	// click random item in range
	public static void clickRandomItem(String xpath, int range) throws Exception {
		do {
			System.err.println("> range: " + range);
			int item = randomIntNumber(range);
			System.err.println("> item: " + item);
			By element = By.xpath(String.format(xpath, item));
			System.out.println("> trying to click item: " + element);
			if (waitForElement(element)) {
				scrollPageToElementAndClick(element);
				break;
			} else {
				System.err.println(">> NoSuchElement!");
				range = range / 2;
			}
		} while (range > 1);
	}

	// click random item in range
	public static void clickRandomItem(String xpath, int range1, int range2) throws Exception {
		do {
			System.err.println("> range1: " + range1);
			int item1 = randomIntNumber(range1);
			System.err.println("> item1: " + item1);

			System.err.println("> range2: " + range2);
			int item2 = randomIntNumber(range2);
			System.err.println("> item 2: " + item2);

			By element = By.xpath(String.format(xpath, item1, item2));
			System.out.println("> trying to click item: " + element);

			if (waitForElement(element)) {
				scrollPageToElementAndClick(element);
				break;
			} else {
				System.err.println(">> NoSuchElement!");
				range1 = range1 / 2;
				range2 = range2 / 2;
			}
		} while (range1 > 1 && range2 > 1);
	}

	// click random item in range
	public static void clickRandomItem(String xpath, int range1, int range2, int range3) throws Exception {
		do {
			System.err.println("> range1: " + range1);
			int item1 = randomIntNumber(range1);
			System.err.println("> item1: " + item1);

			System.err.println("> range2: " + range2);
			int item2 = randomIntNumber(range2);
			System.err.println("> item 2: " + item2);

			System.err.println("> range3: " + range3);
			int item3 = randomIntNumber(range3);
			System.err.println("> item 3: " + item3);

			By element = By.xpath(String.format(xpath, item1, item2, item3));
			System.out.println("> trying to click item: " + element);

			if (waitForElement(element)) {
				scrollPageToElementAndClick(element);
				break;
			} else {
				System.err.println(">> NoSuchElement!");
				range1 = range1 / 2;
				range2 = range2 / 2;
				range3 = range3 / 2;
			}
		} while (range1 > 1 && range2 > 1 && range3 > 1);
	}

	public static void sleep(long time) throws Exception {
		System.err.println("> sleep " + time + " second(s)");
		waitForPageToBeReady();
		Thread.sleep(time * 1000);
	}

	public static void refreshPage() throws Exception {
		waitForPageToBeReady();
		System.err.println("> refreshing page...");
		getDriver().navigate().refresh();
	}

	public static void switchTab() throws Exception {
		System.out.println(">>> switchTab: ");
		waitForPageToBeReady();
		RemoteWebDriver driver = getDriver();
		String oldTab = driver.getWindowHandle();
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		newTab.remove(oldTab);
		// change focus to new tab
		driver.switchTo().window(newTab.get(0));
	}

	public static void open() throws Exception {
		QTiumNavigator.open();
	}

	public static void openURL(String URL) throws Exception {
		QTiumNavigator.open(URL);
	}

	public void waitUntilHTMLReady(int _timeoutInSeconds) {
		new FluentWait<WebDriver>(getDriver()).withTimeout(_timeoutInSeconds, TimeUnit.SECONDS)
				.pollingEvery(50, TimeUnit.MILLISECONDS).until(new ExpectedCondition<Boolean>() {
					public Boolean apply(WebDriver d) {
						try {
							JavascriptExecutor jsExec = (JavascriptExecutor) d;
							return (Boolean) jsExec.executeScript("return document.readyState").toString()
									.equals("complete");
						} catch (Exception e) {
							return true;
						}
					}
				});
	}

	public static void waitForPageToBeReady() {
		// JavascriptExecutor js = ((JavascriptExecutor) getDriver());
		// int timeout = 0;
		// do {
		// try {
		// Thread.sleep(1000);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// timeout++;
		// System.out.println("> waiting for page to be ready..." + timeout);
		// } while (!js.executeScript("return
		// document.readyState").toString().equals("complete")
		// && timeout < QTiumSetting.getPageWait());

		WebDriverWait wait = new WebDriverWait(getDriver(), QTiumSetting.getPageWait());

		wait.until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver wdriver) {
				System.out.println("> waiting for page to be ready... " + String
						.valueOf(((JavascriptExecutor) getDriver()).executeScript("return document.readyState")));
				return ((JavascriptExecutor) (JavascriptExecutor) getDriver())
						.executeScript("return document.readyState").equals("complete");
			}
		});

		System.out.println(">> page is ready!");
	}

	public static WebElement findElement(By element) throws Exception {
		waitForPageToBeReady();
		WebDriverWait wait = new WebDriverWait(getDriver(), QTiumSetting.getObjecWait());
		return wait.until(ExpectedConditions.presenceOfElementLocated(element));
	}

	public static List<WebElement> findElements(By element) throws Exception {
		waitForElement(element);
		return getDriver().findElements(element);
	}

	public static boolean waitForElement(By element) throws Exception {
		System.out.println("> waiting for element: " + element);
		waitForPageToBeReady();
		boolean isExist = false;
		try {
			// getDriver().findElement(element);
			WebDriverWait wait = new WebDriverWait(getDriver(), QTiumSetting.getObjecWait());
			wait.until(ExpectedConditions.presenceOfElementLocated(element));
			isExist = true;
			System.err.println(">> Found!");
		} catch (TimeoutException e) {
			System.err.println(">> Timeout! ");
		}
		return isExist;
	}
	
	public static boolean waitForElementDisappear(By element) throws Exception {
		System.out.println("> waiting for element disappear: " + element);
		waitForPageToBeReady();
		boolean isDisappear = false;
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), QTiumSetting.getObjecWait());
			wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
			isDisappear = true;
			System.err.println(">> Disappear! ");
		} catch (TimeoutException e) {
			System.err.println(">> Timeout! ");
		}
		return isDisappear;
	}

	public static boolean isElementDisplayed(By element) throws Exception {
		System.out.println("> checking if element displayed: " + element);
		boolean isDisplay = false;
		try {
			WebElement webElement = findElement(element);
			isDisplay = webElement.isDisplayed();
			if (isDisplay)
				System.err.println("Displayed!");
			else
				System.err.println("Not displayed!");
		} catch (TimeoutException e) {
			System.err.println(">> Timeout! ");
		}
		return isDisplay;
	}

	public static void waitForControlClose(By element) {
		int timeout = QTiumSetting.getObjecWait();
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), timeout);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
		} catch (Exception e) {
			System.err.println("waitForControlClose got error: " + e.getMessage());
		}
	}

	public static void waitForControlClose(By element, long timeout) {
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), timeout);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
		} catch (Exception e) {
			System.err.println("waitForControlClose error: " + e.getMessage());
		}
	}

	public static boolean isPageDisplayed(String pageTitle) {
		boolean isExist = false;
		long timeout = QTiumSetting.getObjecWait() * 1000;
		try {
			getDriver().manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
			String title = getDriver().getTitle();
			long getTickCount = System.currentTimeMillis();
			while (!title.equals(pageTitle)) {
				Thread.sleep(50);
				title = getDriver().getTitle();
				if ((System.currentTimeMillis() - getTickCount) > timeout) {
					break;
				}
			}

			if (title.equals(pageTitle))
				isExist = true;
		} catch (Exception e) {
			isExist = false;
			System.err.println("isPageDisplayed: title=" + pageTitle + " - message: " + e.getMessage());
		}

		System.out.println("isPageDisplayed - pageTitle: " + pageTitle + " >> " + isExist + " .."
				+ Thread.currentThread().getId());
		return isExist;
	}

	public static boolean isElementClickable(By element) throws Exception {
		System.out.println("> checking if element is clickable: " + element);
		waitForPageToBeReady();
		try {
			// sleep(5);
			WebDriverWait wait = new WebDriverWait(getDriver(), QTiumSetting.getObjecWait());
			wait.until(ExpectedConditions.elementToBeClickable(element));
			System.err.println(">> Clickable!");
			return true;
		} catch (TimeoutException e) {
			System.err.println(">> Timeout!");
			return false;
		} catch (Exception e) {
			System.err.println(">> isElementClickable - error: " + e.getMessage());
			return false;
		}
	}

	public static boolean isAlertDisplayed() {
		try {
			getDriver().switchTo().alert();
			return true;
		} // try
		catch (NoAlertPresentException e) {
			return false;
		} // catch
	} // isAlertPresent()

	public static boolean isAlertPresent() {
		try {
			getDriver().getTitle();
			return false;
		} catch (UnhandledAlertException e) {
			// Modal dialog showed
			return true;
		}
	}

	public static void enterJS(By element, String value) throws Exception {
		System.err.println("> enterJS: " + element);
		WebElement webElement = findElement(element);
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].setAttribute('value', arguments[1])", webElement,
				value);
	}

	public static void enter(By element, String value) throws Exception {
		System.out.println("> enter: " + element);
		int attempts = 0;
		while (attempts < 10) {
			try {
				WebElement webElement = findElement(element);
				webElement.clear();
				webElement.sendKeys(value);
				break;
			} catch (ElementNotVisibleException e) {
				System.err.println(">> ElementNotVisibleException! Trying enterJS...");
				enterJS(element, value);
			} catch (StaleElementReferenceException e) {
				System.err.println("StaleElementReferenceException! Retrying...");
			}
			attempts++;
		}
	}

	public static void clickJS(By element) throws Exception {
		System.out.println("> clickByJS: " + element);
		executeJavaScript("arguments[0].click();", element);
	}

	public static void click(By element) throws Exception {
		System.out.println("> click: " + element);
		int attempts = 0;
		while (attempts < 10) {
			try {
				WebElement webElement = findElement(element);
				webElement.click();
				break;
			} catch (ElementNotVisibleException e) {
				System.err.println(">> ElementNotVisibleException!");
				clickJS(element);
				break;
			} catch (StaleElementReferenceException e) {
				System.err.println("StaleElementReferenceException! Retrying...");
			}
			attempts++;
		}
	}

	public static void executeJavaScript(String javaScript, By element) throws Exception {

		WebElement webElement = findElement(element);
		((JavascriptExecutor) getDriver()).executeScript(javaScript, webElement);

	}

	public static void moveMouseToElementJS(By element) throws Exception {
		System.out.println("> moveMouseToElementJS: " + element);
		String javaScript = "var evObj = document.createEvent('MouseEvents');"
				+ "evObj.initMouseEvent(\"mouseover\",true, false, window, 0, 0, 0, 0, 0, false, false, false, false, 0, null);"
				+ "arguments[0].dispatchEvent(evObj);";
		executeJavaScript(javaScript, element);
	}

	public static void moveMouseToElement(By element) throws Exception {
		if (waitForElement(element))
			try {
				WebElement webElement = findElement(element);
				System.out.println("> moving mouse to element: " + element);
				Actions action = new Actions(getDriver());
				action.moveToElement(webElement).perform();
			} catch (Exception e) {
				System.err.println(">> Exception: " + e.getMessage());
				moveMouseToElementJS(element);
			}
	}

	public static void scrollPageToElementAndClick(By element) throws Exception {
		scrollPageToElement(element);
		click(element);
	}

	public static void scrollPageToElementAndEnter(By element, String value) throws Exception {
		scrollPageToElement(element);
		enter(element, value);
	}

	public static void scrollPageToElement(By element) throws Exception {
		try {
			WebElement webElement = findElement(element);
			System.out.println("> scrollPageToElement: " + element);
			Actions actions = new Actions(getDriver());
			actions.moveToElement(webElement).perform();
		} catch (ElementNotVisibleException e) {
			System.err.println(">> ElementNotVisibleException! ");
			scrollPageToElementJS(element);
		} catch (WebDriverException e) {
			System.err.println(">> WebDriverException: " + e.getMessage());
			scrollPageToElementJS(element);
		}
	}

	public static void scrollPageToElementJS(By element) throws Exception {
		System.out.println("> scrollPageToElementByJS: " + element);
		WebElement webElement = findElement(element);
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();", webElement);
	}

	public static void setCheckbox(By element, boolean isCheck) throws Exception {
		if (!isChecked(element) && isCheck) {
			click(element);
		}
	}

	public static String getSelectedTextOfDropdown(By element) throws Exception {
		String text = null;
		int attempts = 0;
		while (attempts < 10) {
			try {
				Select select = new Select(findElement(element));
				text = select.getFirstSelectedOption().getText();
				break;
			} catch (StaleElementReferenceException e) {
				System.err.println("StaleElementReferenceException! Retrying...");
			}
			attempts++;
		}
		return text;
	}

	public static boolean checkSelectOptionSize(By element) throws Exception {
		if (waitForElement(element)) {
			Select select = new Select(findElement(element));
			if (select.getOptions().size() > 1)
				return true;
			return false;
		}
		// return true if element not found
		return true;
	}

	public static void selectByIndex(By element) throws Exception {
		System.out.println("> selectByIndex: " + element);
		// Select select = new Select(getDriver().findElement(element));
		Select select = new Select(findElement(element));
		int attempts = 0;
		while (attempts < 10) {
			try {
				System.out.println("> default item: " + select.getFirstSelectedOption().getText());
				int item = randomIntNumber(select.getOptions().size()) - 1;
				// select.selectByIndex(1);
				select.selectByIndex(item);
				System.out.println("> selected item: " + item + " - " + select.getFirstSelectedOption().getText());
				break;
			} catch (StaleElementReferenceException e) {
				System.err.println("StaleElementReferenceException! Retrying...");
			} catch (TimeoutException e) {
				System.err.println("Timeout! Retrying...");
			}
			attempts++;
		}
	}

	public static void selectByVisibleText(By element, String text) throws Exception {
		Select select = new Select(findElement(element));
		System.out.println("> selectByVisibleText: " + element);
		select.selectByVisibleText(text);
	}

	public static String getTableCellValue(By element, int rowIndex, int colIndex) throws Exception {
		String sResult = "";
		rowIndex = rowIndex - 1;
		colIndex = colIndex - 1;
		waitForElement(element);
		WebElement tableElement = findElement(element);
		List<WebElement> rows = tableElement.findElements(By.xpath("tbody/tr"));
		if (rowIndex > rows.size())
			return sResult;
		for (int i = 0; i < rows.size(); i++) {
			if (i == rowIndex) {
				WebElement row = rows.get(i);
				List<WebElement> cols = row.findElements(By.xpath("td"));
				if (colIndex > cols.size())
					return sResult;
				for (int j = 0; j < cols.size(); j++) {
					if (j == colIndex) {
						WebElement col = cols.get(j);
						sResult = col.getText();
						break;
					}
				}
				break;
			}
		}

		return sResult;
	}

	public static boolean isChecked(By element) throws Exception {
		WebElement webElement = getDriver().findElement(element);
		return webElement.isSelected();
	}

	public static String getSelectedComboboxItemText(By element) throws Exception {
		String text = "";
		WebElement webElement = findElement(element);
		Select selectedValue = new Select(webElement);
		text = selectedValue.getFirstSelectedOption().getText();
		return text;
	}

	public static String getText(By element) throws Exception {
		return findElement(element).getText();
	}

	public static void set(By element, boolean isCheck) throws Exception {
		boolean check = isChecked(element);
		WebElement webElement = findElement(element);
		if ((isCheck && !check) || (!isCheck && check)) {
			webElement.click();
		}
	}

	public static void set(By element, boolean isCheck, boolean realState) {
		WebElement webElement = getDriver().findElement(element);
		if ((isCheck && !realState) || (!isCheck && realState)) {
			webElement.click();
		}
	}

	public static String getAttribute(By element, String att) throws Exception {
		waitForElement(element);
		WebElement webElement = getDriver().findElement(element);
		return webElement.getAttribute(att);
	}

	public static void logReport(String report, Class<?> cls) {
		Log log = LogFactory.getLog(cls);
		log.info(report);
	}

	public static void focusElement(By element) throws Exception {
		if (isElementExists(element)) {
			getDriver().findElement(element).sendKeys(Keys.NULL);
		}
	}

	public static boolean isElementExists(By element) throws Exception {
		waitForPageToBeReady();
		return waitForElement(element);
	}

	public static void close() {
		QTiumDriverManager.closeWebDriver();
	}

	public static String getDate() {
		// Create object of SimpleDateFormat class and decide the format
		DateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy ");

		// get current date time with Date()
		Date date = new Date();

		// Now format the date
		return dateFormat.format(date);
	}

	public static void takeSnapShot(ITestResult result) throws Exception {
		// Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		String methodName = result.getName();
		if (!result.isSuccess()) {
			File scrFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
			try {
				String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath()
						+ "/failure-screenshots/" + getDate() + "/" + getDriver().getCapabilities().getBrowserName();
				// calendar.getTime()
				File destFile = new File(
						(String) reportDirectory + "/" + formater.format(new Date()) + "_" + methodName + ".png");
				FileUtils.copyFile(scrFile, destFile);
				Reporter.log("<a href='" + destFile.getAbsolutePath() + "'> <img src='" + destFile.getAbsolutePath()
						+ "' height='100' width='100'/> </a>");
				System.out.println("Screen captured...");
			} catch (Exception e) {
				System.err.println("takeSnapShot - Exception: " + e.getMessage());
			}
		}
	}

	public static void sendEmail() {

		final String username = "frt2018.test001@gmail.com";
		final String password = "FRTtest123a@";

		Properties props = new Properties();
		props.put("mail.smtp.auth", true);
		props.put("mail.smtp.starttls.enable", true);
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.EnableSSL.enable", "true");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("frt2018.test001@gmail.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("frt2018.test001@gmail.com"));
			message.setSubject("Report for FptShop Automation Testing");
			// message.setText("Report for FptShop Automation Testing hihi");

			MimeBodyPart messageBodyPart = new MimeBodyPart();

			Multipart multipart = new MimeMultipart();

			messageBodyPart = new MimeBodyPart();
			String file = "../Selenium-TestNG/test-output/emailable-report.html";
			String fileName = "emailable-report.html";
			DataSource source = new FileDataSource(file);
			messageBodyPart.setDataHandler(new DataHandler(source));
			messageBodyPart.setFileName(fileName);
			multipart.addBodyPart(messageBodyPart);

			message.setContent(multipart);

			Transport.send(message);

			System.out.println("Sent email!");

		} catch (Exception e) {
			System.err.println("sendEmail - Exception: " + e.getMessage());
		}
	}

}
