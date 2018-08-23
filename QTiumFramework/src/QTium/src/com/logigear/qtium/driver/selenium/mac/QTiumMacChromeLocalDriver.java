package com.logigear.qtium.driver.selenium.mac;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.logigear.qtium.QTiumConstants;
import com.logigear.qtium.driver.QTiumLocalDriver;

public class QTiumMacChromeLocalDriver extends QTiumLocalDriver {

	private String _chromeDriverExecutable;

	public void setDriverExe(String driverExe) {
		this._chromeDriverExecutable = driverExe;
	}

	@Override
	public String getDeviceName() {
		return QTiumConstants.DEVICE_MAC;
	}

	public QTiumMacChromeLocalDriver() {

	} // end method

	@Override
	public String getProvider() {
		return "selenium";
	}

	@Override
	public void createWebDriver() {
		File file = null;

		file = new File(_chromeDriverExecutable);
		String sFile = file.getAbsolutePath();
		System.setProperty("webdriver.chrome.driver", sFile);

		if (this._webDriver == null) {
			System.out.println("*** Chrome driver is NULL ***");
		} else {
			System.out.println("*** Chrome driver is NOT NULL ***");
		}
		try {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-infobars");
			options.addArguments("disable-browser-side-navigation");
			options.addArguments("disable-gpu");
//			option.addArguments("start-fullscreen");
			this._webDriver = new ChromeDriver(options);
			System.err.println("[info] Chrome driver is created.");
		} catch (Exception e) {
			System.out.println("Chrome - createWebDriver - exception: " + e.getMessage());
		}
	}

	@Override
	public String getApplicationType() {
		return QTiumConstants.APP_TYPE_CHROME;
	}
} // end class
