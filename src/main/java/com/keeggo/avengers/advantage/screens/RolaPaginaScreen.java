package com.keeggo.avengers.advantage.screens;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.keeggo.avengers.advantage.cucumber.TestContext;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class RolaPaginaScreen {

	private WebDriverWait wait;
	private TestContext TC;
	private TouchAction action;

	public RolaPaginaScreen(AndroidDriver<WebElement> driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 10);
	}
	
	public void Rola_A_Pagina(double inicio, double fim) throws Exception {

		Dimension size = TC.getAndroidDriverManager().getDriver().manage().window().getSize();

		int x = size.width / 2;

		int yInicial = (int) (size.height * inicio);
		int yFinal = (int) (size.height * fim);

		new TouchAction((PerformsTouchActions) TC.getAndroidDriverManager()).press(PointOption.point(x, yInicial)).waitAction()
				.moveTo(PointOption.point(x, yFinal)).release().perform();
	}

	public void Rola_Paises(AndroidDriver<WebElement> driver, String visibleText) {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ visibleText + "\").instance(0))")
				.click();
	}

	public void Rola_Pagina(AndroidDriver<WebElement> driver, String visibleText) {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ visibleText + "\").instance(0))");
	}
}
