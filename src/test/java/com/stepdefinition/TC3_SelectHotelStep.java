package com.stepdefinition;

import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import junit.framework.Assert;


public class TC3_SelectHotelStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();
	
	
	@Then("User should select a hotel from the available list and continue")
	public void userShouldSelectAHotelFromTheAvailableListAndContinue() {
	pom.getSelectHotelPage().hotelSelect();
	}
	
	@Then("User must verify the success message {string}")
	public void userMustVerifyTheSuccessMessage(String successtxt) {
	WebElement theSuccessMsg = pom.getSelectHotelPage().getTheSuccessMsg();
	String elementGetText = elementGetText(theSuccessMsg);
	boolean contains = elementGetText.contains(successtxt);
	Assert.assertTrue("Verify date success message contains" , contains);

	}

	@Then("User should continue without selecting a hotel from the available list")
	public void userShouldContinueWithoutSelectingAHotelFromTheAvailableList() {
	pom.getSelectHotelPage().notselect();
	}
	
	@Then("User should verify the error message {string}")
	public void userShouldVerifyTheErrorMessage(String fail) {
	WebElement failmsg = pom.getSelectHotelPage().getFailmsg();
	String elementGetText = elementGetText(failmsg);
	boolean contains = elementGetText.contains(fail);
	Assert.assertTrue("Verify select hotel fail message contains" , contains);

	}




	

}
