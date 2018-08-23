package com.logigear.qtium.driver.selenium.mac;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.logigear.qtium.QTiumConstants;
import com.logigear.qtium.driver.QTiumLocalDriver;

public class QTiumMacFirefoxLocalDriver extends QTiumLocalDriver {

	@Override
	public String getDeviceName() {
		return QTiumConstants.DEVICE_MAC;
	}

	public QTiumMacFirefoxLocalDriver() {
		System.out.println("QTiumWindowsFirefoxLocalDriver - creator");
	}

	@Override
	public String getProvider() {
		return "selenium";
	}

	@Override
	public void createWebDriver() {
		try {
			this._webDriver = new FirefoxDriver();
			System.out.println("[info] Firefox driver is created.");
		} catch (Exception ex) {
			System.err.println("FireFox - createWebDriver - exception: " + ex.getMessage());
		}
	}

	@Override
	public String getApplicationType() {
		return QTiumConstants.APP_TYPE_FIREFOX;
	}
}
