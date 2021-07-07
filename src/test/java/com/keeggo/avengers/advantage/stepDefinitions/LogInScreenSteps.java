package com.keeggo.avengers.advantage.stepDefinitions;

import com.keeggo.avengers.advantage.cucumber.TestContext;
import com.keeggo.avengers.advantage.screens.LogInScreen;

import cucumber.api.java.pt.Quando;

public class LogInScreenSteps {

	LogInScreen LS;
	TestContext tc;

	public LogInScreenSteps(TestContext context) {
		tc = context;
		LS = tc.getPageObjectManager().getLogInScreen();
	}
	
	@Quando("^clicar em novo usuario$")
	public void clicar_em_novo_usuario() throws Throwable {
		LS.Clica_Em_Novo_Usuario();
	}
}
