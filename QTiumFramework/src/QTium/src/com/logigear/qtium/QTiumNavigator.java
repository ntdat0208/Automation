package com.logigear.qtium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import com.logigear.qtium.driver.QTiumDriverManager;
import com.logigear.selenium.QTiumAutomation;
import com.logigear.selenium.QTiumSetting;

public class QTiumNavigator {
	
	/**
	 * Open a web page or start native application on Max OS X
	 * @param url
	 * @throws Exception
	 */
	public static void open(String url) throws Exception{
		// get exist WebDriver or create a new WebDriver
		WebDriver webDriver = QTiumDriverManager.getAndCheckWebDriver();
		System.err.println(webDriver);
//		webDriver.manage().window().setSize(new Dimension(1366, 768));
		webDriver.manage().window().maximize();
		webDriver.manage().timeouts().implicitlyWait(QTiumSetting.getObjecWait(), TimeUnit.SECONDS);
		webDriver.manage().timeouts().pageLoadTimeout(QTiumSetting.getPageWait(), TimeUnit.SECONDS);
		// use that driver to open new url
		webDriver.get(url);
		// delete cookies
		webDriver.manage().deleteAllCookies();
		// wait for deleting cookies
		QTiumAutomation.sleep(5);
	}
	
	/**
	 * Start native application on Android
	 * @param url
	 * @throws Exception
	 */
	public static void open() throws Exception{
		QTiumDriverManager.getAndCheckWebDriver();		
	}
}
