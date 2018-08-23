package Common;

import com.logigear.selenium.QTiumSetting;

public class Common {

	public static void config() {
		// Configure browser to launch
		System.out.print("set object wait: " + Constants.ObjectWait + "s");
		QTiumSetting.setObjecWait(Constants.ObjectWait);
		System.out.print("set page wait: " + Constants.PageWait + "s");
		QTiumSetting.setPageWait(Constants.PageWait);
	}
}
