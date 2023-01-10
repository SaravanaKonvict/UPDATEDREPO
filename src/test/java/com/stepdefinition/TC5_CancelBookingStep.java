package com.stepdefinition;

import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class TC5_CancelBookingStep extends  BaseClass {

PageObjectManager pom = new PageObjectManager();


	@Then("User should cancel the Generated order Id.")
	public void userShouldCancelTheGeneratedOrderId() {
pom.getCancelBookingPage().cancelBookedOrder();		
	}
	@Then("User need to verify the success message {string}")
	public void userNeedToVerifyTheSuccessMessage(String s1) {
		WebElement cancelMsg = pom.getCancelBookingPage().getCancelMsg();
		String elementGetText = elementGetText(cancelMsg);
		boolean contains = elementGetText.contains(s1);
		Assert.assertTrue("Verify cancel success message contains" , contains);
	}

	@Then("User should cancel the required Existing order Id {string}")
	public void userShouldCancelTheRequiredExistingOrderId(String OrderId) {
	pom.getCancelBookingPage().cancelExistingOrder(OrderId);
	}
	@Then("User Should verify the success cancellation message {string}")
	public void userShouldVerifyTheSuccessCancellationMessage(String s2) {
		WebElement cancelMsg = pom.getCancelBookingPage().getCancelMsg();
		String elementGetText = elementGetText(cancelMsg);
		boolean contains = elementGetText.contains(s2);
		Assert.assertTrue("Verify First Name Error message contains" , contains);

	}





	

}
