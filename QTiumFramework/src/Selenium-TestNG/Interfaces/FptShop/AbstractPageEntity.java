package FptShop;

import org.openqa.selenium.By;

import com.logigear.selenium.QTiumElementDefinition;

public class AbstractPageEntity {

	public static By SEARCH_TEXTBOX = QTiumElementDefinition.Xpath("//header//input");
	public static By SEARCH_BUTTON = QTiumElementDefinition.Xpath("//header//button");

	public static String CATEGORY = "//nav[@class='fs-menu']/div/ul/li[%s]/a";
	public static String BRAND = "//nav[@class='fs-menu']/div/ul/li[%s]/div/div/div[%s]//li[%s]/a";
	
	public static String DYNACMIC_CATEGORY = "//nav[@class='fs-menu']/div/ul/li/a[contains(text(),'%s')]";
	public static String DYNACMIC_BRAND = "//nav[@class='fs-menu']/div/ul/li/div/div/div/ul/li/a[contains(@title,'%s')]";
	
	public static By INSTALLMENT_BUYING = QTiumElementDefinition.Xpath("//nav[@class='fs-menu']/div/ul/li/a[contains(text(),'TRẢ GÓP 0%')]");
	
	public static By SUBSIDY_BUTTON = QTiumElementDefinition.Xpath("//ul[@class='fs-hdmn']/li[1]/a");
	public static By NEWS_BUTTON = QTiumElementDefinition.Xpath("//ul[@class='fs-hdmn']/li[2]/a/i");
	
	public static By SEARCH_SUGGESTION_ITEM = QTiumElementDefinition.Xpath("//div[@class='fs-search']//div[@class='fs-sresult']//li[1]/a//img");
	
	public static String BEST_BUY_ITEM = "//nav[@class='fs-menu']/div/ul/li[%s]/div/div/div[3]//li[%s]/a";
	
	public static String RANKING_PAGE = "//nav[@class='fs-menu']/div/ul/li[%s]/div/div/div[3]/p[@class='fs-mnsbxh']/a";
}
