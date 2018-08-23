package FptShop;

import org.openqa.selenium.By;

import com.logigear.selenium.QTiumAutomation;

public class BrandPage {

	public static synchronized BrandPage getBrandPage() {
		if (instance == null)
			instance = new BrandPage();
		return instance;
	}

	private static BrandPage instance = null;

	// select an item at BrandPage
	public void selectItem(String itemName) throws Exception {
		System.out.println("selecting item at BrandPage: " + itemName);
		By element = By.xpath(String.format(BrandPageEntity.DYNAMIC_ITEM, itemName));
		QTiumAutomation.click(element);
	}

	public void selectItem() throws Exception {
		System.out.println("selecting item at BrandPage...");
		QTiumAutomation.clickRandomItem(BrandPageEntity.ITEM_LINK, 19);
	}
}
