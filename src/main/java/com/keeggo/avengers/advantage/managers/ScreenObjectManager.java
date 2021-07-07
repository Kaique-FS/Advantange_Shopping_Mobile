package com.keeggo.avengers.advantage.managers;

import org.openqa.selenium.WebElement;

import com.keeggo.avengers.advantage.screens.HomeScreen;
import com.keeggo.avengers.advantage.screens.LogInScreen;
import com.keeggo.avengers.advantage.screens.RegisterScreen;

import io.appium.java_client.android.AndroidDriver;

public class ScreenObjectManager {

	private AndroidDriver<WebElement> driver;
	private HomeScreen HP;
	private LogInScreen LP;
	private RegisterScreen RP;
	
	public ScreenObjectManager(AndroidDriver<WebElement> androidDriver) {
		this.driver = androidDriver;
	}

	public HomeScreen getHomeScreen() {
		return (HP == null) ? HP = new HomeScreen(driver) : HP;
	}
	
	public LogInScreen getLogInScreen() {
		return (LP == null) ? LP = new LogInScreen(driver) : LP;
	}
	
	public RegisterScreen getRegisterScreen() {
		return (RP == null) ? RP = new RegisterScreen(driver) : RP;
	}

}
