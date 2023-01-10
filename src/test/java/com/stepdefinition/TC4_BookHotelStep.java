package com.stepdefinition;

import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class TC4_BookHotelStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();


	@Then("User should book the hotel by giving inputs to all the mandatory fields {string} , {string} and {string}")
	public void userShouldBookTheHotelByGivingInputsToAllTheMandatoryFieldsAnd(String FirstName, String LastName, String BillingAddress, io.cucumber.datatable.DataTable dataTable) {

		pom.getBookHotelPage().allOptions(FirstName, LastName, BillingAddress, dataTable);
	}
	
	@Then("User should verify the success message {string} and save the Order No.")
	public void userShouldVerifyTheSuccessMessageAndSaveTheOrderNo(String success) {
		WebElement ss = pom.getBookHotelPage().getTheBookingConfirmation();
		String elementGetText = elementGetText(ss);
		boolean contains = elementGetText.contains(success);
		Assert.assertTrue("Verify booking success message contains" , contains);

	}


	@Then("User should click book now")
	public void userShouldClickBookNow() {
		pom.getBookHotelPage().noOptions();
	}

	
	@Then("User should verify the following error messages {string} , {string} , {string} , {string} , {string} , {string} and {string}")
	public void userShouldVerifyTheFollowingErrorMessagesAnd(String s1, String s2, String s3, String s4, String s5, String s6, String s7) {
		WebElement theFirstError = pom.getBookHotelPage().getTheFirstError();
		String elementGetText = elementGetText(theFirstError);
//		System.out.println(s1);
//		System.out.println(elementGetText);
		Assert.assertEquals(s1, elementGetText);

		WebElement theLastError = pom.getBookHotelPage().getTheLastError();
		String elementGetText2 = elementGetText(theLastError);
//		System.out.println(s2);
//		System.out.println(elementGetText2);
		Assert.assertEquals(s2, elementGetText2);
		
		WebElement theBillingError = pom.getBookHotelPage().getTheBillingError();
		String elementGetText3 = elementGetText(theBillingError);
//		System.out.println(s3);
//		System.out.println(elementGetText3);
		Assert.assertEquals(s3, elementGetText3);
		
		WebElement theCardNoError = pom.getBookHotelPage().getTheCardNoError();
		String elementGetText4 = elementGetText(theCardNoError);
//		System.out.println(s4);
//		System.out.println(elementGetText4);
		Assert.assertEquals(s4, elementGetText4);

		WebElement theCardTypeError = pom.getBookHotelPage().getTheCardTypeError();
		String elementGetText5 = elementGetText(theCardTypeError);
//		System.out.println(s5);
//		System.out.println(elementGetText5);
		Assert.assertEquals(s5, elementGetText5);

		WebElement theYearMonthError = pom.getBookHotelPage().getTheYearMonthError();
		String elementGetText6 = elementGetText(theYearMonthError);
//		System.out.println(s6);
//		System.out.println(elementGetText6);
		Assert.assertEquals(s6, elementGetText6);
		
		WebElement theCVVError = pom.getBookHotelPage().getTheCVVError();
		String elementGetText7 = elementGetText(theCVVError);
//		System.out.println(s7);
//		System.out.println(elementGetText7);
		Assert.assertEquals(s7, elementGetText7);

	
	}







}
