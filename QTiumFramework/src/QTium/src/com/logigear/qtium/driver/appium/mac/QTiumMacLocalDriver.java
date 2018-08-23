package com.logigear.qtium.driver.appium.mac;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.logigear.qtium.QTiumConstants;
import com.logigear.qtium.driver.QTiumLocalDriver;

public class QTiumMacLocalDriver extends QTiumLocalDriver {
	protected String _remoteAddress;
	protected String _appPath;
	@Override
	public String getDeviceName() {
		return QTiumConstants.DEVICE_MAC;
	}

	@Override
	public String getProvider() {
		return "appium";
	}

	public void setremoteaddress(String remoteaddress) {
		this._remoteAddress = remoteaddress;
	}
	public void setapppath(String apppath) {
		this._appPath = apppath;
	}
	@Override
	public void createWebDriver() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setPlatform(Platform.MAC);
		this._webDriver = new RemoteWebDriver(new URL(this._remoteAddress), capabilities);
	}

	@Override
	public String getApplicationType() {
		return QTiumConstants.APP_TYPE_NATIVE_APP;
	}
}
