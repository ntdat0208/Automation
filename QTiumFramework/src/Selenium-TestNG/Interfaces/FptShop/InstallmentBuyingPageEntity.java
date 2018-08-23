package FptShop;

import org.openqa.selenium.By;

import com.logigear.selenium.QTiumElementDefinition;

public class InstallmentBuyingPageEntity {
	
	public static String CREDIT_BUTTON = "//button[@class='tg-rhtbtn tgs-%s']";
	
	public static By CLIENT_NAME_ERROR_MESSAGE = QTiumElementDefinition.Xpath("//label[contains(@id,'txtNameError')]");
	public static By CLIENT_PHONE_NUMBER_ERROR_MESSAGE = QTiumElementDefinition.Xpath("//label[contains(@id,'txtPhoneError')]");
	public static By CLIENT_ID_ERROR_MESSAGE = QTiumElementDefinition.Xpath("//label[contains(@id,'txtCmdError')]");
	public static By CLIENT_BIRTH_DAY_ERROR_MESSAGE = QTiumElementDefinition.Xpath("//label[contains(@id,'txtDateError')]");
	public static By CLIENT_CITY_ERROR_MESSAGE = QTiumElementDefinition.Xpath("//label[contains(@id,'sl-cityError')]");
	public static By CLIENT_DICSTRICT_ERROR_MESSAGE = QTiumElementDefinition.Xpath("//label[contains(@id,'sl-districtError')]");
	public static By CLIENT_ADDRESS_ERROR_MESSAGE = QTiumElementDefinition.Xpath("//label[contains(@id,'txtAddressError')]");
	public static By CLIENT_GUARANTOR_PHONE_NUMBER_ERROR_MESSAGE = QTiumElementDefinition.Xpath("//label[contains(@id,'txtPhoneNumberGuarantorError')]");
	
	public static By CLIENT_NAME_TEXTBOX = QTiumElementDefinition.Id("txtName");
	public static By CLIENT_PHONE_NUMBER_TEXTBOX = QTiumElementDefinition.Id("txtPhone");
	public static By CLIENT_ID_TEXTBOX = QTiumElementDefinition.Id("txtCmd");
	public static By CLIENT_BIRTH_DAY_TEXTBOX = QTiumElementDefinition.Id("num1");
	public static By CLIENT_BIRTH_MONTH_TEXTBOX = QTiumElementDefinition.Id("num2");
	public static By CLIENT_BIRTH_YEAR_TEXTBOX = QTiumElementDefinition.Id("num3");
	
	public static By CLIENT_CITY_DROPDOWN = QTiumElementDefinition.Id("sl-city");
	public static By CLIENT_DICSTRICT_DROPDOWN = QTiumElementDefinition.Id("sl-district");
	public static By CLIENT_ADDRESS_TEXTBOX = QTiumElementDefinition.Id("txtAddress");
	public static By CLIENT_GUARANTOR_PHONE_NUMBER_TEXTBOX = QTiumElementDefinition.Id("txtPhoneNumberGuarantor");
	
	public static By SHOP_CITY_DROPDOWN = QTiumElementDefinition.Id("CityIDShop");
	public static By SHOP_DICSTRICT_DROPDOWN = QTiumElementDefinition.Id("DistrictIDShop");
	
	public static By ADD_ORDER_BUTTON = QTiumElementDefinition.Id("AddOrderRecurring");
	
	public static By SUCCESSFULLY_ORDER_LABEL = QTiumElementDefinition.Xpath("//h4[text()='Cảm ơn quý khách đã mua hàng tại FPTshop.com.vn']");
}
