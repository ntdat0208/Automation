package FptShop;

import org.openqa.selenium.By;

import com.logigear.selenium.QTiumAutomation;
import com.logigear.selenium.QTiumElementDefinition;

public class InstallmentBuyingCategoryPage {
	public static synchronized InstallmentBuyingCategoryPage getInstallmentBuyingCategoryPage() {
		if (instance == null)
			instance = new InstallmentBuyingCategoryPage();
		return instance;
	}

	private static InstallmentBuyingCategoryPage instance = null;
	
	public void removeMainNav() throws Exception {
		System.out.println("> removing MainNav...");
		QTiumAutomation.executeJavaScript("arguments[0].remove()", QTiumElementDefinition.Id("mainNav"));
		System.out.println("> removed!");
	}

	public void installmentBuying() throws Exception {
		removeMainNav();
		System.out.println("installment Buying...");
		int type = QTiumAutomation.randomIntNumber(2);
		int item = QTiumAutomation.randomIntNumber(7);
		By element = By.xpath(String.format(InstallmentBuyingCategoryPageEntity.INSTALLMENT_BUYING_BUTTON, type, item));
//		QTiumAutomation.scrollPageToElement(element);
//		String url = QTiumAutomation.findElement(element).getAttribute("href");
		QTiumAutomation.scrollPageToElementAndClick(element);
//		QTiumAutomation.openURL(url);
		QTiumAutomation.switchTab();
	}

	public void selectItem() throws Exception {
		int type = QTiumAutomation.randomIntNumber(2);
		int item = QTiumAutomation.randomIntNumber(7);
		By element = By.xpath(String.format(InstallmentBuyingCategoryPageEntity.ITEM_LINK, type, item));
		QTiumAutomation.scrollPageToElementAndClick(element);
//		String url = QTiumAutomation.findElement(element).getAttribute("href");
//		QTiumAutomation.openURL(url);
		QTiumAutomation.switchTab();
	}
}
