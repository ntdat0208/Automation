package FptShop;

import org.openqa.selenium.UnhandledAlertException;

import com.logigear.selenium.QTiumAutomation;

import Common.Constants;

public class CartPage {
	public static synchronized CartPage getCartPage() {
		if (instance == null)
			instance = new CartPage();
		return instance;
	}

	private static CartPage instance = null;

	// select selectPlaceToReceive
	public void selectPlaceToReceive() throws Exception {
		int receive = QTiumAutomation.randomIntNumber(2);
		// int receive = 1;
		if (receive == 1) {
			// receive at shop
			System.out.println("receiveAtShop...");
			receiveAtShop();
		} else if (receive == 2) {
			System.out.println("receiveAtHome...");
			// receive at home
			receiveAtHome();
		}
		// else {
		// // skip
		// System.out.println("skipping selectShipping...");
		// QTiumAutomation.click(CartPageEntity.SHIP_SKIP_BUTTON);
		// }
	}

	// select shop to receive at
	public void receiveAtShop() throws Exception {
		try {
			do {
				QTiumAutomation.click(CartPageEntity.RECEIVE_AT_SHOP_TAB);
				QTiumAutomation.selectByIndex(CartPageEntity.SHOP_CITY_DROPDOWN);
				QTiumAutomation.sleep(2);
				// QTiumAutomation.selectByIndex(CartPageEntity.SHOP_DICSTRICT_DROPDOWN);
				// QTiumAutomation.sleep(5);
				// QTiumAutomation.click(CartPageEntity.SHOP_TO_RECEIVE_RADIO);
				QTiumAutomation.click(CartPageEntity.SHIP_CONTINUE_BUTTON);
			} while (!QTiumAutomation.waitForElementDisappear(CartPageEntity.SHIP_CONTINUE_BUTTON));
		} catch (UnhandledAlertException e) {
			System.err.println("UnhandledAlertException!!!");
			QTiumAutomation.dismissAlert();
			receiveAtShop();
		}
	}

	// fill address to receive at
	public void receiveAtHome() throws Exception {
		do {
			QTiumAutomation.click(CartPageEntity.RECEIVE_AT_HOME_TAB);

			do {
				QTiumAutomation.selectByIndex(CartPageEntity.HOME_CITY_DROPDOWN);
				QTiumAutomation.sleep(2);
			} while (!QTiumAutomation.checkSelectOptionSize(CartPageEntity.HOME_DICSTRICT_DROPDOWN));

			QTiumAutomation.selectByIndex(CartPageEntity.HOME_DICSTRICT_DROPDOWN);

			QTiumAutomation.enter(CartPageEntity.HOME_ADDRESS_TEXTBOX, "ecom test");
			QTiumAutomation.click(CartPageEntity.SHIP_CONTINUE_BUTTON);
		} while (QTiumAutomation.isElementDisplayed(CartPageEntity.SHIPPING_ERROR));
	}

	// select payment
	public void selectPayment() throws Exception {
		do {
			QTiumAutomation.click(CartPageEntity.ADD_ORDER_BUTTON);
		} while (QTiumAutomation.isElementDisplayed(CartPageEntity.ADD_ORDER_BUTTON));
	}

	// fill client info, select address & select payment
	public void checkOut() throws Exception {
		fillClientInfo();
		selectPlaceToReceive();
		selectPayment();
	}

	public void fillClientInfo() throws Exception {
		System.out.println("filling client information at CartPage...");
		do {
			QTiumAutomation.enter(CartPageEntity.CLIENT_NAME_TEXTBOX, Constants.CLIENT_NAME);
			QTiumAutomation.enter(CartPageEntity.CLIENT_PHONE_TEXTBOX, Constants.CLIENT_PHONE);
			QTiumAutomation.enter(CartPageEntity.CLIENT_EMAIL_TEXTBOX, Constants.CLIENT_EMAIL);
			QTiumAutomation.click(CartPageEntity.CLIENT_CONTINUE_BUTTON);
			// QTiumAutomation.click(CartPageEntity.ORDER_FAST_BUTTON);
		} while (QTiumAutomation.isElementDisplayed(CartPageEntity.CLIENT_NAME_ERROR)
				|| QTiumAutomation.isElementDisplayed(CartPageEntity.CLIENT_PHONE_ERROR)
				|| QTiumAutomation.isElementClickable(CartPageEntity.CHECKOUT_BUTTON));
	}
}
