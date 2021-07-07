package com.keeggo.avengers.advantage.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.keeggo.avengers.advantage.cucumber.TestContext;
import com.keeggo.avengers.advantage.screens.RegisterScreen;
import com.keeggo.avengers.advantage.screens.RolaPaginaScreen;

import cucumber.api.java.pt.Quando;
import io.appium.java_client.android.AndroidDriver;

public class RegisterScreenSteps {

	private WebDriver driver;
	private RegisterScreen Screen;
	private TestContext Context;
	private RolaPaginaScreen PaginaScreen;

	public RegisterScreenSteps(TestContext context) {
		Context = context;
		Screen = Context.getPageObjectManager().getRegisterScreen();
	}
	
	@Quando("^inserir o nome de usuario$")
	public void inserir_o_nome_de_usuario()  {
		Screen.Insere_NomeUsuario();
	}

	@Quando("^inserir o email$")
	public void inserir_o_email() {
		Screen.Insere_Email();
	}

	@Quando("^inserir a senha$")
	public void inserir_a_senha() {
		Screen.Insere_Senha();
	}
	
	@Quando("^inserir a confirmação da senha$")
	public void inserir_a_confirmação_da_senha() throws Exception {
		Screen.Insere_Confirma_Senha();
		PaginaScreen.Rola_Pagina((AndroidDriver<WebElement>) driver, "PHONE NUMBER");
	}

	@Quando("^inserir o primeiro nome$")
	public void inserir_o_primeiro_nome() {
		Screen.Insere_PrimeiroNome();
	}

	@Quando("^inserir o ultimo nome$")
	public void inserir_o_ultimo_nome() {
		Screen.Insere_UltimoNome();
	}

	@Quando("^inserir o numero de telefone$")
	public void inserir_o_numero_de_telefone() {
		Screen.Insere_NumeroTelefone();
	}

	@Quando("^inserir o pais$")
	public void inserir_o_pais() {
		Screen.Clica_Em_Pais();
		PaginaScreen.Rola_Paises((AndroidDriver<WebElement>) driver, "Brazil");
	}

	@Quando("^inserir a cidade$")
	public void inserir_a_cidade()  {
		Screen.Insere_Cidade();
	}

	@Quando("^inserir o endereço$")
	public void inserir_o_endereço() {
		Screen.Insere_Endereco();
	}

	@Quando("^inserir o estado$")
	public void inserir_o_estado() {
		Screen.Insere_Estado();
	}

	@Quando("^inserir o codigo postal$")
	public void inserir_o_codigo_postal() {
		Screen.Insere_Codigo_Postal();
	}
	
	@Quando("^clica em propagandas$")
	public void clica_em_propagandas() {
		Screen.Clica_Em_Propagandas();
	}
	
	@Quando("^clica em registrar$")
	public void clica_em_registrar() {
		Screen.Clica_Em_Registrar();
	}
}
