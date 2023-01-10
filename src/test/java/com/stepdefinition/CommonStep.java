package com.stepdefinition;

import io.cucumber.java.en.Then;

public class CommonStep {

	@Then("User should verify after Login Success Message {string}")
	public void userShouldVerifyAfterLoginSuccessMessage(String string) {
	}

	@Then("User should verify the success message {string}")
	public void userShouldVerifyTheSuccessMessage(String string) {
	}
	
}
