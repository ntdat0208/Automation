package FptShop;

import Common.Constants;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;

import com.logigear.selenium.QTiumAutomation;

import FptShop.AbstractPage;

public class HomePage extends AbstractPage {

	public static synchronized HomePage getHomePage() {
		if (instance == null)
			instance = new HomePage();
		return instance;
	}

	private static HomePage instance = null;

	// ----------- business actions

	public void open() throws Exception {
		System.out.println("navigating to homepage...");
		QTiumAutomation.openURL(Constants.FPTSHOP_URL);
		// closePromotionPopup();
	}

	// skip promotion pop up
	public void closePromotionPopup() throws Exception {
		if (QTiumAutomation.waitForElement(HomePageEntity.PROMOTION_POPUP_CLOSE_BUTTON)) {
			System.out.println("closing promotion pop up...");
			QTiumAutomation.click(HomePageEntity.PROMOTION_POPUP_CLOSE_BUTTON);
		}
	}

	public void selectItem() throws Exception {
		int i1 = QTiumAutomation.randomIntNumber(3);
		int i2 = 1;
		if (i1 == 1 || i1 == 2) {
			i2 = QTiumAutomation.randomIntNumber(5) + 1;
		} else if (i1 == 3) {
			i2 = QTiumAutomation.randomIntNumber(3);
		}
		By element = By.xpath(String.format(HomePageEntity.ITEM_LINK, i1, i2));
		QTiumAutomation.scrollPageToElementAndClick(element);
	}
}
