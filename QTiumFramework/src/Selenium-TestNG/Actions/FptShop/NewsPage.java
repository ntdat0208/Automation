package FptShop;

import org.openqa.selenium.By;

import com.logigear.selenium.QTiumAutomation;

public class NewsPage {
	public static synchronized NewsPage getNewsPage() {
		if (instance == null)
			instance = new NewsPage();
		return instance;
	}

	private static NewsPage instance = null;
	
	public void selectItem() throws Exception {
		int category = QTiumAutomation.randomIntNumber(5);
		By element = By.xpath(String.format(NewsPageEntity.ITEM_LINK, category));
		System.out.println("selecting item at NewsPage...");
		QTiumAutomation.scrollPageToElement(element);
		String url = QTiumAutomation.findElement(element).getAttribute("href");
		QTiumAutomation.openURL(url);
	}
}
