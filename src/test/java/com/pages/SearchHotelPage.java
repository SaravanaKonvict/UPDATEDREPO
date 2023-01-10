package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SearchHotelPage extends BaseClass {

	public SearchHotelPage() {
	
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(name="location")
	private WebElement theLocation;
	
	@FindBy(name="hotels")
	private WebElement theHotels;
	
	@FindBy(name="room_type")
	private WebElement theRoomType;
	
	@FindBy(name="room_nos")
	private WebElement theNoOfRooms;
	
	@FindBy(name="datepick_in")
	private WebElement theCheckInDate;
	
	@FindBy(name="datepick_out")
	private WebElement theCheckOutDate;
	
	@FindBy(name="adult_room")
	private WebElement theAdultsPerRoom;
	
	@FindBy(name="child_room")
	private WebElement theChildrenPerRoom;
	
	@FindBy(name="Submit")
	private WebElement theSearch;
	
	@FindBy(id="checkin_span")
	private WebElement checkInError;
	
	@FindBy(id="checkout_span")
	private WebElement checkOutError;
	
	@FindBy(id="location_span")
	private WebElement locationError;
	
	public WebElement getCheckInError() {
		return checkInError;
	}



	public WebElement getCheckOutError() {
		return checkOutError;
	}



	public WebElement getLocationError() {
		return locationError;
	}



	public WebElement getTheLocation() {
		return theLocation;
	}



	public WebElement getTheHotels() {
		return theHotels;
	}




	public WebElement getTheRoomType() {
		return theRoomType;
	}



	public WebElement getTheNoOfRooms() {
		return theNoOfRooms;
	}




	public WebElement getTheCheckInDate() {
		return theCheckInDate;
	}




	public WebElement getTheCheckOutDate() {
		return theCheckOutDate;
	}



	public WebElement getTheAdultsPerRoom() {
		return theAdultsPerRoom;
	}


	public WebElement getTheChildrenPerRoom() {
		return theChildrenPerRoom;
	}




	public WebElement getTheSearch() {
		return theSearch;
	}




	public void allInputs(String Location, String Hotels, String RoomType, String NumberofRooms, String CheckInDate,
			String CheckOutDate, String adultsperRoom, String childrenperRoom) {

		
		selectbytext(getTheLocation(), Location);
		selectbytext(getTheHotels(), Hotels);
		selectbytext(getTheRoomType(), RoomType);
		selectbytext(getTheNoOfRooms(), NumberofRooms);
clear(getTheCheckInDate());
enterValues(getTheCheckInDate(), CheckInDate);
clear(getTheCheckOutDate());
enterValues(getTheCheckOutDate(), CheckOutDate);
selectbytext(getTheAdultsPerRoom(), adultsperRoom);
selectbytext(getTheChildrenPerRoom(),childrenperRoom);

click(getTheSearch());

	}
	
	public void onlyMandatory(String Location, String NumberofRooms, String CheckInDate,
			String CheckOutDate, String AdultsperRoom) {

		selectbytext(getTheLocation(), Location);
		selectbytext(getTheNoOfRooms(), NumberofRooms);
clear(getTheCheckInDate());
enterValues(getTheCheckInDate(), CheckInDate);
clear(getTheCheckOutDate());
enterValues(getTheCheckOutDate(), CheckOutDate);
selectbytext(getTheAdultsPerRoom(), AdultsperRoom);
click(getTheSearch());

	}
	
	public void invalidDate(String Location, String Hotels, String RoomType, String NumberofRooms, String CheckInDate,
			String CheckOutDate, String AdultsperRoom, String ChildrenperRoom) {
		selectbytext(getTheLocation(), Location);
		selectbytext(getTheHotels(), Hotels);
		selectbytext(getTheRoomType(), RoomType);
		selectbytext(getTheNoOfRooms(), NumberofRooms);
clear(getTheCheckInDate());
enterValues(getTheCheckInDate(), CheckInDate);
clear(getTheCheckOutDate());
enterValues(getTheCheckOutDate(), CheckOutDate);
selectbytext(getTheAdultsPerRoom(), AdultsperRoom);
selectbytext(getTheChildrenPerRoom(),ChildrenperRoom);

click(getTheSearch());		
	}
	
	public void justSearch() {
		click(getTheSearch());
				
	}
}
