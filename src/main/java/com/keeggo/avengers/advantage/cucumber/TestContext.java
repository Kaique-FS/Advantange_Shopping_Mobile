package com.keeggo.avengers.advantage.cucumber;

import com.keeggo.avengers.advantage.managers.AndroidDriverManager;
import com.keeggo.avengers.advantage.managers.ScreenObjectManager;

import io.appium.java_client.TouchAction;

public class TestContext {

	private AndroidDriverManager AndoridManager;
	private ScreenObjectManager ScreenManager;
	public ScenarioContext Context;

	public TestContext() throws Exception {
		AndoridManager = new AndroidDriverManager();
		ScreenManager = new ScreenObjectManager(AndoridManager.getDriver());
		Context = new ScenarioContext();
	}

	public AndroidDriverManager getAndroidDriverManager() {
		return AndoridManager;
	}

	public ScreenObjectManager getPageObjectManager() {
		return ScreenManager;
	}

	public ScenarioContext getScenarioContext() {
		return Context;
	}

}
