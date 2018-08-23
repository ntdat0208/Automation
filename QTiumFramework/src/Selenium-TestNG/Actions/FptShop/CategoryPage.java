package FptShop;

import org.openqa.selenium.By;

import com.logigear.selenium.QTiumAutomation;

public class CategoryPage {
	public static synchronized CategoryPage getCategoryPage() {
		if (instance == null)
			instance = new CategoryPage();
		return instance;
	}

	private static CategoryPage instance = null;

	public void selectBrand() {
		int brand = QTiumAutomation.randomIntNumber(6);
		By element = By.xpath(String.format(CategoryPageEntity.BRAND_LINK, brand));
		System.out.println("selecting Brand at CategoryPage...");
		try {
			QTiumAutomation.scrollPageToElementAndClick(element);
		} catch (Exception e) {
			System.err.println("selectBrand - Exception: " + e.getMessage());
		}
	}

	public void selectPriceRange() throws Exception {
//		QTiumAutomation.refreshPage();
		int rangePrice = QTiumAutomation.randomIntNumber(5);
		By element = By.xpath(String.format(CategoryPageEntity.PRICE_RANGE_LINK, rangePrice));
		System.out.println("selecting PriceRange at CategoryPage...");
		QTiumAutomation.click(element);
	}

	public void selectItem() throws Exception {
		int type = QTiumAutomation.randomIntNumber(4);
		int item = QTiumAutomation.randomIntNumber(4);
		By element = By.xpath(String.format(CategoryPageEntity.ITEM_LINK, type, item));
		System.out.println("selecting item at CategoryPage...");
		QTiumAutomation.scrollPageToElementAndClick(element);
	}
}
