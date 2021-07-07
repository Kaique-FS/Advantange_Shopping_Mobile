package com.keeggo.avengers.advantage.stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;
import com.keeggo.avengers.advantage.cucumber.TestContext;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	TestContext TC;

	public Hooks(TestContext context) {
		TC = context;
	}

	@Before
	public void BeforeSteps() throws Exception {
		TC.getAndroidDriverManager().getDriver();
	}

	@After(order = 1)
	public void afterCenario(Scenario scenario) throws Exception {
		String screenshotName = scenario.getName().replaceAll(" ", "_");
		try {
			File sourcePath = ((TakesScreenshot) TC.getAndroidDriverManager().getDriver())
					.getScreenshotAs(OutputType.FILE);

			File destinationPath = new File(
					System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + screenshotName + ".png");

			Files.copy(sourcePath, destinationPath);

			Reporter.addScreenCaptureFromPath(destinationPath.toString());
		} catch (IOException e) {
			System.out.println("Houve problemas ao copiar a captura de tela e envia-la para o report.html");
		}
	}

	@After(order = 0)
	public void AfterSteps() {
		TC.getAndroidDriverManager().FechaAndroid();
	}
}
