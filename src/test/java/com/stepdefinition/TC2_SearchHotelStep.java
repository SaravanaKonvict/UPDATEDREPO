package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_SearchHotelStep extends BaseClass {
PageObjectManager pom = new PageObjectManager();

	@Then("User should search the hotel by giving inputs to all the fields as per requirement {string} , {string} , {string} , {string} , {string} , {string} , {string} and {string}")
	public void userShouldSearchTheHotelByGivingInputsToAllTheFieldsAsPerRequirementAnd(String Location, String Hotels, String RoomType, String NumberofRooms, String CheckInDate, String CheckOutDate, String adultsperRoom, String childrenperRoom) {
	pom.getSearchHotelPage().allInputs(Location, Hotels, RoomType, NumberofRooms, CheckInDate, CheckOutDate, adultsperRoom, childrenperRoom);
	
	}

	@Then("User should search the hotel by giving inputs to only the mandatory fields as per requirement {string} , {string} , {string} , {string} and {string}")
	public void userShouldSearchTheHotelByGivingInputsToOnlyTheMandatoryFieldsAsPerRequirementAnd(String Location, String NumberofRooms, String CheckInDate, String CheckOutDate, String AdultsperRoom) {
	
		pom.getSearchHotelPage().onlyMandatory(Location, NumberofRooms, CheckInDate, CheckOutDate, AdultsperRoom);
	}


	@Then("user should give input to check in date as any upcoming date, check out date should be the day before check in date and other fields as per the requirement {string} , {string} , {string} , {string} , {string} , {string} , {string} and {string}")
	public void userShouldGiveInputToCheckInDateAsAnyUpcomingDateCheckOutDateShouldBeTheDayBeforeCheckInDateAndOtherFieldsAsPerTheRequirementAnd(String Location, String Hotels, String RoomType, String NumberofRooms, String CheckInDate, String CheckOutDate, String AdultsperRoom, String ChildrenperRoom) {
	pom.getSearchHotelPage().invalidDate(Location, Hotels, RoomType, NumberofRooms, CheckInDate, CheckOutDate, AdultsperRoom, ChildrenperRoom);
	
	}
	@Then("User should verify the date selection error message {string}, {string} to change the date")
	public void userShouldVerifyTheDateSelectionErrorMessageToChangeTheDate(String errormsg1, String errormsg2) {
		WebElement checkInError = pom.getSearchHotelPage().getCheckInError();
		WebElement checkOutError = pom.getSearchHotelPage().getCheckOutError();
		String elementGetText = elementGetText(checkInError);
		String elementGetText2 = elementGetText(checkOutError);
		boolean contains = elementGetText.contains(errormsg1);
		boolean contains2 = elementGetText2.contains(errormsg2);
		Assert.assertTrue("Verify date selection Check in error message contains" , contains);
		Assert.assertTrue("Verify date selection Check out error message contains" , contains2);

	}

	@Then("User should search the hotel by without giving any inputs to fields")
	public void userShouldSearchTheHotelByWithoutGivingAnyInputsToFields() {
		
		pom.getSearchHotelPage().justSearch();
	}
	@Then("User should verify the select location error message {string}")
	public void userShouldVerifyTheSelectLocationErrorMessage(String Locerror) {
	WebElement locationError = pom.getSearchHotelPage().getLocationError();
	String elementGetText = elementGetText(locationError);
	boolean contains = elementGetText.contains(Locerror);
	Assert.assertTrue("Verify date select location error message contains" , contains);

	}






	






	
	
}
