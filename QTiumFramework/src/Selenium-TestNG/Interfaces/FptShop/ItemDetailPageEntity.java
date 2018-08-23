package FptShop;

import org.openqa.selenium.By;

import com.logigear.selenium.QTiumElementDefinition;

public class ItemDetailPageEntity {
	public static By PROMOTION_POPUP = QTiumElementDefinition.Xpath("//div[@class='fsneo-box']");
	
	public static By CHAT = QTiumElementDefinition.Id("sbzon_frame");
	
	public static By ORDER_BUTTON = QTiumElementDefinition.Xpath("//div[@id='btn-order']/p/a");
	public static By CLIENT_NAME_TEXTBOX = QTiumElementDefinition.Xpath("//input[@id='FullName']");
	public static By CLIENT_PHONE_TEXTBOX = QTiumElementDefinition.Xpath("//input[@id='Phone']");
	public static By SUBMIT_BUTTON = QTiumElementDefinition.Xpath("//li[@class='fs-feblibtn']/button[@type='submit']");
	
	public static By ORDER_SUCCESSFULLLY_BUTTON = QTiumElementDefinition.Xpath("//div[@id='PopFeback']//p[@class='fs-popssft']/a");
	
	public static By CONTACT_WHEN_AVAILABLE_BUTTON = QTiumElementDefinition.Xpath("//div[@id='btn-order']/p/a/span");
	
	public static By BUYNOW_BUTTON = QTiumElementDefinition.Xpath("//a[@class='fs-dti-oder dts-addtocart']/p");
	public static By INSTALLMENT_BUYING_BUTTON = QTiumElementDefinition.Xpath("//a[@class='fs-dti-tgop btn-ntc-ttd']");
	public static By SHOP_BOOKING_LINK = QTiumElementDefinition.Xpath("//div[@id='invullistshop']/div[@id='mCSB_2']/div[@id='mCSB_2_container']/ul/li[1]//a/span");
}
