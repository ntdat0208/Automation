package FptShop;

import org.openqa.selenium.By;

import com.logigear.selenium.QTiumElementDefinition;

public class CartPageEntity {

	public static By CHECKOUT_BUTTON = QTiumElementDefinition.Xpath("//button[@class='fs-ghggbtn']");

	public static By CLIENT_PHONE_ERROR = QTiumElementDefinition.Id("uphone-error");
	public static By CLIENT_NAME_ERROR = QTiumElementDefinition.Id("uname-error");
	
	public static By CLIENT_NAME_TEXTBOX = QTiumElementDefinition.Id("uname");
	public static By CLIENT_PHONE_TEXTBOX = QTiumElementDefinition.Id("uphone");
	public static By CLIENT_EMAIL_TEXTBOX = QTiumElementDefinition.Id("uemail");
	public static By CLIENT_CONTINUE_BUTTON = QTiumElementDefinition.Id("ubtn");
	public static By ORDER_FAST_BUTTON = QTiumElementDefinition.Id("orderfast");	
	

	public static By RECEIVE_AT_SHOP_TAB = QTiumElementDefinition.Xpath("//li[@role='presentation'][contains(@class,'gh-s2c50')][1]//i");
	public static By SHOP_CITY_DROPDOWN = QTiumElementDefinition.Id("CityIDShop");
	public static By SHOP_DICSTRICT_DROPDOWN = QTiumElementDefinition.Id("DistrictIDShop");	
	public static By SHOP_TO_RECEIVE_RADIO = QTiumElementDefinition.Xpath("//div[@id='lisuggest']//li[1]/label//i[1]");
	public static By SHIP_CONTINUE_BUTTON = QTiumElementDefinition.Id("shipconti");
	
	public static By RECEIVE_AT_HOME_TAB = QTiumElementDefinition.Xpath("//li[@role='presentation'][contains(@class,'gh-s2c50')][2]//i");//li[@role='presentation'][contains(@class,'gh-s2c50')][1]//i
	public static By HOME_CITY_DROPDOWN = QTiumElementDefinition.Id("CityIDHome");
	public static By HOME_DICSTRICT_DROPDOWN = QTiumElementDefinition.Id("DistrictHome");
	public static By HOME_ADDRESS_TEXTBOX = QTiumElementDefinition.Id("addresshome");
	public static By SHIPPING_ERROR = QTiumElementDefinition.Id("shipmess");
	
	public static By SHIP_SKIP_BUTTON = QTiumElementDefinition.Id("shipignore");
	
	public static By ADD_ORDER_BUTTON = QTiumElementDefinition.Id("AddOrder");
}
