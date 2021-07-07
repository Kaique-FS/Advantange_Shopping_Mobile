package com.keeggo.avengers.advantage.screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class HomeScreen {

	private WebDriverWait wait;

	public HomeScreen(AndroidDriver<WebElement> driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 10);
	}
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewMenu")
	private WebElement bnt_Menu;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewMenuUser")
	private WebElement bnt_LogIn;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewCart")
	private WebElement bnt_Cart;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewSearch")
	private WebElement bnt_Lupa;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/editTextSearch")
	private WebElement txt_Lupa;
	
	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView")
	private WebElement bnt_Laptops;
	
	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.ImageView")
	private WebElement bnt_Headphones;
	
	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.ImageView")
	private WebElement bnt_Tablets;
	
	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.ImageView")
	private WebElement bnt_Speakers;
	
	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.ImageView")
	private WebElement bnt_Mice;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewMenuUser")
	private WebElement txtbx_NomeUsuario;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewMenuSignOut")
	private WebElement btn_Deslogar;

	public void Clica_No_Menu() {
		bnt_Menu.click();
	}
	
	public void Clica_Em_LogIn() {
		bnt_LogIn.click();
	}
	
	public void Clica_No_Carrinho() {
		bnt_Cart.click();
	}
	
	public void Clica_Na_Lupa() {
		bnt_Lupa.click();
	}
	
	public void Insere_Dado_Lupa_1() {
		txt_Lupa.sendKeys("Mice");
	}
	
	public void Insere_Dado_Lupa_2() {
		txt_Lupa.sendKeys("Carregador");
	}
	
	public void Clica_Em_Laptops() {
		bnt_Laptops.click();
	}
	
	public void Clica_Em_Headphones() {
		bnt_Headphones.click();
	}
	
	public void Clica_Em_Tablets() {
		bnt_Tablets.click();
	}
	
	public void Clica_Em_Speakers() {
		bnt_Speakers.click();
	}
	
	public void Clica_Em_Mice() {
		bnt_Mice.click();
	}
	
	public boolean Verifica_Usuario() {
		 return txtbx_NomeUsuario.isEnabled();
	}
	
	public void Clica_Em_Deslogar() {
		btn_Deslogar.click();
	}
	
}
