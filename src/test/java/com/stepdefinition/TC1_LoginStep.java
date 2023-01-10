package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;
import com.pages.Login;

import io.cucumber.java.en.*;

public class TC1_LoginStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();
	
	
	@Given("User is on the Adactin Page")
	public void userIsOnTheAdactinPage() {
	
	}
	@When("User should perform login {string},{string}")
	public void userShouldPerformLogin(String userName, String password) {
		pom.getLoginPage().normalLogin(userName, password);
		
		
	}

	@When("User should perform login {string},{string} with Enter Key")
	public void userShouldPerformLoginWithEnterKey(String userName, String password) throws AWTException {
	pom.getLoginPage().loginWithEnter(userName, password);
	
	}


	@Then("User should verify the Invalid credentials error meesage containing {string}")
	public void userShouldVerifyTheInvalidCredentialsErrorMeesageContaining(String expLoginErrorMessage) {

		WebElement txtErrorMsg = pom.getLoginPage().getTxtErrorMsg();	
		String elementGetTexts = elementGetText(txtErrorMsg);
		boolean b = elementGetTexts.contains(expLoginErrorMessage);
		Assert.assertTrue("Verify after login with invalid credentials error message contains" , b);

	}



	


	
}
