package com.keeggo.avengers.advantage.stepDefinitions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.keeggo.avengers.advantage.cucumber.TestContext;
import com.keeggo.avengers.advantage.screens.HomeScreen;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class HomeScreenSteps {

	HomeScreen Home;
	TestContext Context;

	public HomeScreenSteps(TestContext context) {
		Context = context;
		Home = Context.getPageObjectManager().getHomeScreen();
	}
	
	@Dado("^usuário em questão está Pagina inicial$")
	public void usuário_em_questão_está_Pagina_inicial() throws Exception {
		Context.getAndroidDriverManager().getDriver();
	}

	@Quando("^clicar em menu$")
	public void clicar_em_login() throws Throwable {
		Home.Clica_No_Menu();
	}

	@Quando("^clicar em login$")
	public void clicar_em_novo_usuario() throws Throwable {
	    Home.Clica_Em_LogIn();
	}
	
	@Quando("^pesquisar produto existente$")
	public void insere_texto_de_pesquisa_valido(){
		Home.Insere_Dado_Lupa_1();
	}
	
	@Quando("^pesquisar produto inexistente$")
	public void insere_texto_de_pesquisa_invalido(){
		Home.Insere_Dado_Lupa_2();
	}
	
	@Quando("^fazer a busca do produto existente$")
	public void clicar_na_lupa(){
		Home.Clica_Na_Lupa();
	}
	
	@Quando("^fazer a busca do produto inexistente$")
	public void clicar_na_lupa_2(){
		Home.Clica_Na_Lupa();
	}
	
	@Quando("^clicar em headphones$")
	public void clica_em_headphones(){
		Home.Clica_Em_Headphones();
	}
	
	@Quando("^clicar em tablets$")
	public void clica_em_tablets(){
		Home.Clica_Em_Tablets();
	}
	
	@Entao("^entrar na conta cadastrada$")
	public void entrar_na_conta_cadastrada() {
		assertTrue(Home.Verifica_Usuario());
		Context.getAndroidDriverManager().FechaAndroid();
	}
	
	@Entao("^aparece mensagem de usuario ja cadastrado$")
	public void conferir_cadastro() {
		assertFalse(Home.Verifica_Usuario());
		Context.getAndroidDriverManager().FechaAndroid();
	}
}
