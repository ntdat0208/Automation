package FptShop;

import org.openqa.selenium.By;

import com.logigear.selenium.QTiumElementDefinition;

public class HomePageEntity {
	public static By DTKM_HOT_LINK = QTiumElementDefinition.Xpath("//div[@class='main-ver2']/h2[1]/a[@class='fs-hotit']");
	
	public static String ITEM_LINK = "//div[@class='fs-horow clearfix'][%s]/div[%s]/a";
	
	public static By PROMOTION_POPUP = QTiumElementDefinition.Xpath("//div[@class='fsneo-box']");
	
	public static By PROMOTION_POPUP_CLOSE_BUTTON = QTiumElementDefinition.Xpath("//div[@class='fsneo-box']/div[@style='display: block;']/span[@class='fsneo-close']");
}
