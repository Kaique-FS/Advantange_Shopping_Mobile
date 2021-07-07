package com.keeggo.avengers.advantage.managers;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AndroidDriverManager {

	private AndroidDriver<WebElement> driver;
	private DesiredCapabilities capabilities;

	@SuppressWarnings({ "rawtypes" })
	public AndroidDriver<WebElement> getDriver() throws Exception {
		if (driver == null) {
			capabilities = new DesiredCapabilities();

			capabilities.setCapability("deviceName", "AOSP on IA Emulator");
			capabilities.setCapability("platformVersion", "9");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("appPackage", "com.Advantage.aShopping");
			capabilities.setCapability("appActivity", "com.Advantage.aShopping.SplashActivity");
			capabilities.setCapability("newCommandTimeOut", "120");

			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}
		return driver;
	}

	public AndroidDriver<WebElement> FechaAndroid() {
		if (driver != null) {
			driver.quit();
		}
		return driver = null;
	}
}
