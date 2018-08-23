package FptShop;

import org.openqa.selenium.By;

import com.logigear.selenium.QTiumElementDefinition;

public class OrderResultPageEntity {
	public static By SUCCESSFULLY_ORDER_LABEL = QTiumElementDefinition.Xpath("//h4[text()='Cảm ơn quý khách đã mua hàng tại FPTshop.com.vn']");
	public static By SUCCESSFULLY_ORDER_ICON = QTiumElementDefinition.Xpath("//i[@class='ghic ghi-ss']");
	public static By RATING_POP_UP = QTiumElementDefinition.Xpath("//div[contains(@class,'fancybox-desktop')]");
	public static By RATING_POP_UP_CLOSE_BUTTON = QTiumElementDefinition.Xpath("//i[contains(@id,'icon-close-button')]");
}
