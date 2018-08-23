package FptShop;

import org.openqa.selenium.By;

import com.logigear.selenium.QTiumAutomation;

import Common.Constants;

public class SearchResultPage {
	
	public static synchronized SearchResultPage getSearchResultPage()
	{
		if(instance == null)
			instance = new SearchResultPage();
		return instance;
	}
	
	private static SearchResultPage instance = null;
	
	public void selectItem() throws Exception {
		String itemName = Constants.FPTSHOP_ITEM_NAME;
		By element = By.xpath(String.format(SearchResultPageEntity.ITEM_LINK, itemName));
		QTiumAutomation.click(element);
	}
}
