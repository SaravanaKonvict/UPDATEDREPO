package com.stepdefinition;

import org.junit.After;
import org.junit.Before;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.Scenario;

public class HooksClass extends BaseClass {
	PageObjectManager pom = new PageObjectManager();

	@Before
	public void beforeScenario() {

		browserLaunch("chrome");
		launchUrl("https://adactinhotelapp.com/");

		
	}
	
	@After
	public void afterScenario(Scenario scenario) {

	scenario.attach(takeScreenshot(), "images/png", "Every scenario");
	driver.quit();
	}
}
