package FptShop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.logigear.selenium.QTiumAssert;
import com.logigear.selenium.QTiumAutomation;

import Common.Constants;

public class ItemDetailPage {
	public static synchronized ItemDetailPage getItemDetailPage() {
		if (instance == null)
			instance = new ItemDetailPage();
		return instance;
	}

	private static ItemDetailPage instance = null;

	// skip promotion pop up
	public void removeChat() throws Exception {
		System.out.println("removing chat iframe...");
		if (QTiumAutomation.waitForElement(ItemDetailPageEntity.CHAT))
			try {
				// ((JavascriptExecutor) QTiumAutomation.getDriver())
				// .executeScript("document.getElementsByClassName('sbzon')[0].remove()");
				QTiumAutomation.executeJavaScript("arguments[0].remove()", ItemDetailPageEntity.CHAT);
				System.err.println(">>> removed!");
			} catch (Exception e) {
				System.err.println("removeChat - Exception: " + e);
			}
	}

	public void contactWhenAvailable() throws Exception {
		System.out.println("contactWhenAvailable...");
		QTiumAutomation.scrollPageToElementAndClick(ItemDetailPageEntity.CONTACT_WHEN_AVAILABLE_BUTTON);
		QTiumAutomation.enter(ItemDetailPageEntity.CLIENT_NAME_TEXTBOX, Constants.CLIENT_NAME);
		QTiumAutomation.enter(ItemDetailPageEntity.CLIENT_PHONE_TEXTBOX, Constants.CLIENT_PHONE);
		QTiumAutomation.click(ItemDetailPageEntity.SUBMIT_BUTTON);
		if (QTiumAutomation.isElementClickable(ItemDetailPageEntity.ORDER_SUCCESSFULLLY_BUTTON))
			QTiumAssert.verifyTrue(true);
		else
			QTiumAssert.verifyTrue(false);
		System.err.println("Done!!!");
	}

	public boolean checkItemStatus() throws Exception {
		QTiumAutomation.sleep(5);
		this.removeChat();
		System.out.println("checking item status...");
		if (QTiumAutomation.isElementDisplayed(ItemDetailPageEntity.CONTACT_WHEN_AVAILABLE_BUTTON)) {
			System.out.println(">>> out of stock!");
			return false;
		} else {
			System.out.println(">>> in stock!");
			return true;
		}
	}

	public void buyNow() throws Exception {
		QTiumAutomation.sleep(5);
		System.out.println("selecting buyNow at ItemDetailPage...");
		QTiumAutomation.scrollPageToElementAndClick(ItemDetailPageEntity.BUYNOW_BUTTON);
	}

	public void shopBooking() throws Exception {
		QTiumAutomation.sleep(5);
		System.out.println("selecting shopBooking at ItemDetailPage...");
		QTiumAutomation.scrollPageToElementAndClick(ItemDetailPageEntity.SHOP_BOOKING_LINK);
	}

	public void installmentBuying() throws Exception {
		QTiumAutomation.sleep(5);
		System.out.println("selecting installment buying at ItemDetailPage...");
		QTiumAutomation.scrollPageToElementAndClick(ItemDetailPageEntity.INSTALLMENT_BUYING_BUTTON);
	}
}
