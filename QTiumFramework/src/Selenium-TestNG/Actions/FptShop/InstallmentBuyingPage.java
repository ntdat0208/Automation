package FptShop;

import org.openqa.selenium.By;

import com.logigear.selenium.QTiumAssert;
import com.logigear.selenium.QTiumAutomation;

import Common.Constants;

public class InstallmentBuyingPage {
	public static synchronized InstallmentBuyingPage getInstallmentBuyingPage() {
		if (instance == null)
			instance = new InstallmentBuyingPage();
		return instance;
	}

	private static InstallmentBuyingPage instance = null;

	public void selectInstallmentBuyingMethod() throws Exception {
		// int method = QTiumAutomation.randomIntNumber(2);
		// By element =
		// By.xpath(String.format(InstallmentBuyingPageEntity.CREDIT_BUTTON, method));
		By element = By.xpath(String.format(InstallmentBuyingPageEntity.CREDIT_BUTTON, 1));
		System.out.println("selecting installment buying method...");
		QTiumAutomation.scrollPageToElementAndClick(element);
	}

	public void fillInformationInstallmentBuying() throws Exception {

		selectInstallmentBuyingMethod();

		System.out.println("filling InformationInstallmentBuying...");

		do {
			QTiumAutomation.scrollPageToElementAndEnter(InstallmentBuyingPageEntity.CLIENT_NAME_TEXTBOX,
					Constants.CLIENT_NAME);
			QTiumAutomation.enter(InstallmentBuyingPageEntity.CLIENT_PHONE_NUMBER_TEXTBOX, Constants.CLIENT_PHONE);
			QTiumAutomation.enter(InstallmentBuyingPageEntity.CLIENT_ID_TEXTBOX, Constants.CLIENT_ID);
			QTiumAutomation.enter(InstallmentBuyingPageEntity.CLIENT_BIRTH_DAY_TEXTBOX,
					Integer.toString(QTiumAutomation.randomIntNumber(27)));
			QTiumAutomation.enter(InstallmentBuyingPageEntity.CLIENT_BIRTH_MONTH_TEXTBOX,
					Integer.toString(QTiumAutomation.randomIntNumber(11)));
			QTiumAutomation.enter(InstallmentBuyingPageEntity.CLIENT_BIRTH_YEAR_TEXTBOX,
					Integer.toString(QTiumAutomation.randomIntNumber(50) + 1950));

			do {
				QTiumAutomation.selectByIndex(InstallmentBuyingPageEntity.CLIENT_CITY_DROPDOWN);
				QTiumAutomation.sleep(2);
			} while (!QTiumAutomation.checkSelectOptionSize(InstallmentBuyingPageEntity.CLIENT_DICSTRICT_DROPDOWN));

			QTiumAutomation.selectByIndex(InstallmentBuyingPageEntity.CLIENT_DICSTRICT_DROPDOWN);

			QTiumAutomation.scrollPageToElementAndEnter(InstallmentBuyingPageEntity.CLIENT_ADDRESS_TEXTBOX,
					Constants.CLIENT_ADDRESS);
			QTiumAutomation.enter(InstallmentBuyingPageEntity.CLIENT_GUARANTOR_PHONE_NUMBER_TEXTBOX,
					Constants.CLIENT_GUARANTOR_PHONE);

			do {
				QTiumAutomation.selectByIndex(InstallmentBuyingPageEntity.SHOP_CITY_DROPDOWN);
				QTiumAutomation.sleep(2);
			} while (!QTiumAutomation.checkSelectOptionSize(InstallmentBuyingPageEntity.SHOP_DICSTRICT_DROPDOWN));

			QTiumAutomation.selectByIndex(InstallmentBuyingPageEntity.SHOP_DICSTRICT_DROPDOWN);

			QTiumAutomation.click(InstallmentBuyingPageEntity.ADD_ORDER_BUTTON);

		} while (QTiumAutomation.isElementDisplayed(InstallmentBuyingPageEntity.CLIENT_NAME_ERROR_MESSAGE)
				|| QTiumAutomation.isElementDisplayed(InstallmentBuyingPageEntity.CLIENT_PHONE_NUMBER_ERROR_MESSAGE)
				|| QTiumAutomation.isElementDisplayed(InstallmentBuyingPageEntity.CLIENT_ID_ERROR_MESSAGE)
				|| QTiumAutomation.isElementDisplayed(InstallmentBuyingPageEntity.CLIENT_BIRTH_DAY_ERROR_MESSAGE)
				|| QTiumAutomation.isElementDisplayed(InstallmentBuyingPageEntity.CLIENT_CITY_ERROR_MESSAGE)
				|| QTiumAutomation.isElementDisplayed(InstallmentBuyingPageEntity.CLIENT_DICSTRICT_ERROR_MESSAGE)
				|| QTiumAutomation.isElementDisplayed(InstallmentBuyingPageEntity.CLIENT_ADDRESS_ERROR_MESSAGE)
				|| QTiumAutomation.isElementDisplayed(InstallmentBuyingPageEntity.CLIENT_GUARANTOR_PHONE_NUMBER_ERROR_MESSAGE)
				|| QTiumAutomation.isElementDisplayed(InstallmentBuyingPageEntity.ADD_ORDER_BUTTON));
	}

	public void checkInstallmentBuyingResult() throws Exception {
		System.out.println("checking OrderResult...");
		QTiumAutomation.sleep(5);
		boolean isElementDisplayed = QTiumAutomation
				.waitForElement(InstallmentBuyingPageEntity.SUCCESSFULLY_ORDER_LABEL);
		QTiumAssert.verifyTrue(isElementDisplayed);
		System.err.println("Done!!!");
	}
}
