package FptShop;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;

import com.logigear.selenium.QTiumAssert;
import com.logigear.selenium.QTiumAutomation;

public class OrderResultPage {
	public static synchronized OrderResultPage getOrderResultPage() {
		if (instance == null)
			instance = new OrderResultPage();
		return instance;
	}

	private static OrderResultPage instance = null;

	// skip rating from Order Result Page
	public void skipRating() {
		try {
			if (QTiumAutomation.waitForElement(OrderResultPageEntity.RATING_POP_UP)) {
				System.out.println("skipping rating pop up...");
				// QTiumAutomation.click(OrderResultPageEntity.RATING_POP_UP_CLOSE_BUTTON);
				((JavascriptExecutor) QTiumAutomation.getDriver())
						.executeScript("return document.getElementsByClassName('sp-fancybox-wrap')[0].remove();");
			} else
				System.err.println(">>> No rating pop up!");
		} catch (Exception e) {
			System.err.println(">>> skipRating - error: " + e.getMessage());
		}
	}

	public void checkOrderResult() throws Exception {
		skipRating();
		System.out.println("checking OrderResult...");
		QTiumAutomation.sleep(5);
		boolean isElementDisplayed = QTiumAutomation.waitForElement(OrderResultPageEntity.SUCCESSFULLY_ORDER_LABEL);
		QTiumAssert.verifyTrue(isElementDisplayed);
		System.err.println("Done!!!!!!");
	}
	
	public void checkEventOrderResult() throws Exception {
		skipRating();
		System.out.println("checking Event Result...");
		QTiumAutomation.sleep(5);
		boolean isElementDisplayed = QTiumAutomation.waitForElement(OrderResultPageEntity.SUCCESSFULLY_ORDER_LABEL);
		QTiumAssert.verifyTrue(isElementDisplayed);
		Object abc = ((JavascriptExecutor) QTiumAutomation.getDriver()).executeScript("return dataLayer");
		String result = abc.toString();
		System.err.println("checking Event Result..." + result);
		QTiumAssert.verifyTrue(result.contains("event=purchase"));
		System.err.println("Done!!!!!!");
	}
}
