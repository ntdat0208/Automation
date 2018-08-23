package FptShop;

import org.openqa.selenium.By;

import com.logigear.selenium.QTiumElementDefinition;

public class RankingPageEntity {
	public static String ITEM_LINK = "//div[@class='fshop-bxh-col2']/div[@class='main-product color']/div[%s]//div[@class='bslr-item-content']/a/h3";
	
	public static String ORDER_NOW_BUTTON = "//div[@class='fshop-bxh-col2']/div[@class='main-product color']/div[%s]//a[contains(@class,'order-product')]/i";
	public static By CLIENT_NAME_TEXTBOX= QTiumElementDefinition.Xpath("//div[@class='ppu_tab_right']//input[@name='name']");
	public static By CLIENT_PHONE_TEXTBOX = QTiumElementDefinition.Xpath("//div[@class='ppu_tab_right']//input[@name='phone']");
	public static By SUBMIT_BUTTON = QTiumElementDefinition.Xpath("//div[@class='ppu_tab_right']//input[@type='submit']");	

	public static By NAME_ERROR = QTiumElementDefinition.Xpath("//label[@id='name-error']");
	public static By PHONE_ERROR = QTiumElementDefinition.Xpath("//label[@id='phoneNumber-error']");
	
	public static By SUCCESSFULLY_ORDER_OK_BUTTON = QTiumElementDefinition.Xpath("//p[@class='pd-ftok']/span");
}