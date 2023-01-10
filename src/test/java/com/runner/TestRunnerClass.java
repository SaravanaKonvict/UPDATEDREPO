package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(tags=(" "),dryRun=false,snippets=SnippetType.CAMELCASE,publish=true,stepNotifications=true,plugin={"pretty","html:target\\cucumber-html-report","json:target\\output.json","junit:target\\cucumber.xml"},monochrome=true,features="src\\test\\resources\\Features",glue="com.stepdefinition")
public class TestRunnerClass {

	@AfterClass
	public static void afterClass() {
Reporting.generateJvmReport("C:\\Users\\Konvict\\eclipse-workspace-new\\OMRBRANCHAdactinAutomation\\target");
	}
	
	
}
