package FptShop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.logigear.selenium.QTiumAssert;
import com.logigear.selenium.QTiumAutomation;

import Common.Constants;

public class RankingPage {
	public static synchronized RankingPage getRankingPage() {
		if (instance == null)
			instance = new RankingPage();
		return instance;
	}

	private static RankingPage instance = null;

	// click Order Now button & fill client info at RankingPage
	public void orderNow() throws Exception {
		QTiumAutomation.sleep(10);
		int item = 0;
		int range = 10;
		String clientName = Constants.CLIENT_NAME;
		String clientPhone = Constants.CLIENT_PHONE;
		System.out.println("click Order Now button & fill client info at RankingPage...");
		do {
			item = QTiumAutomation.randomIntNumber(range);
			String xpath = String.format(RankingPageEntity.ORDER_NOW_BUTTON, item);
			System.out.println(">>>>> trying to click item: " + xpath);
			By element = By.xpath(xpath);
			if (QTiumAutomation.waitForElement(element)) {
				QTiumAutomation.scrollPageToElementAndClick(element);
				break;
			} else {
				System.err.println("NoSuchElement: " + xpath);
				range = range / 2;
			}
		} while (range > 1);
		QTiumAutomation.sleep(5);
		do {
			QTiumAutomation.enter(RankingPageEntity.CLIENT_NAME_TEXTBOX, clientName);
			QTiumAutomation.enter(RankingPageEntity.CLIENT_PHONE_TEXTBOX, clientPhone);
			QTiumAutomation.click(RankingPageEntity.SUBMIT_BUTTON);
		} while (QTiumAutomation.waitForElement(RankingPageEntity.NAME_ERROR)||
				QTiumAutomation.waitForElement(RankingPageEntity.PHONE_ERROR));
	}

	// skip promotion pop up
	public void removeHeader() throws Exception {
		System.out.println("removing Header...");
		QTiumAutomation.waitForPageToBeReady();
		By element = By.xpath("//header//div[@class='fshop-mainbox']");
		String js = "arguments[0].remove();";
		QTiumAutomation.executeJavaScript(js, element);
	}

	// select an item at RankingPage
	public void selectItem() throws Exception {
		QTiumAutomation.sleep(5);
		this.removeHeader();
		System.out.println("select an item at RankingPage...");
		QTiumAutomation.clickRandomItem(RankingPageEntity.ITEM_LINK, 10);
	}

	// check Order Successfully
	public void checkOrderResult() throws Exception {
		QTiumAutomation.sleep(5);
		System.out.println("check Order Successfully at RankingPage...");
		QTiumAssert.verifyTrue(QTiumAutomation.isElementClickable(RankingPageEntity.SUCCESSFULLY_ORDER_OK_BUTTON));
	}
}
