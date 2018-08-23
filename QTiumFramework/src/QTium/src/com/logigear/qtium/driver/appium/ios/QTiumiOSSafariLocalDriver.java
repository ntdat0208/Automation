package com.logigear.qtium.driver.appium.ios;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.logigear.qtium.QTiumConstants;
import com.logigear.qtium.driver.QTiumLocalDriver;

public class QTiumiOSSafariLocalDriver extends QTiumLocalDriver {
	protected String _remoteAddress;

	public void setRemoteAddress(String remoteAddress) {
		this._remoteAddress = remoteAddress;
	}

	public QTiumiOSSafariLocalDriver() {
	}

	@Override
	public String getDeviceName() {
		return QTiumConstants.DEVICE_IOS;
	} // end method

	@Override
	public String getProvider() {
		return "appium";
	}

	@Override
	public void createWebDriver() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("browserName", "Safari");
		desiredCapabilities.setCapability("deviceName", "iPhone 6");
		desiredCapabilities.setCapability("platformName", "iOS");
		desiredCapabilities.setCapability("platformVersion", "10.3");
		desiredCapabilities.setCapability("automationName", "XCUITest");
		this._webDriver = new RemoteWebDriver(new URL(_remoteAddress), desiredCapabilities);
		_webDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	@Override
	public String getApplicationType() {
		return QTiumConstants.APP_TYPE_SAFARI;
	}

} // end class
