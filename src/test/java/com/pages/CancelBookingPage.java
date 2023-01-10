package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class CancelBookingPage extends BaseClass {


	public CancelBookingPage() {
	
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSelectId() {
		return selectId;
	}

	public WebElement getCancelSelectedId() {
		return cancelSelectedId;
	}

	
	@FindBy(xpath="(//input[@type='button'])[1]")
	private WebElement cancelButton;
	
	
	public WebElement getCancelButton() {
		return cancelButton;
	}

	@FindBy(name="ids[]")
	private WebElement selectId;
	
	@FindBy(name="cancelall")
	private WebElement cancelSelectedId;
	
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement theBookedItinerary;
	
	@FindBy(name="search_hotel_id")
	private WebElement searchId;
	
	@FindBy(name="order_no")
	private WebElement orderNodetails;
	
	@FindBy(name="order_id_text")
	private WebElement searchOrderId;
	
	
	@FindBy(xpath="//label[contains(text(),'The booking has been cancelled.')]")
	private WebElement cancelMsg;

	public WebElement getTheBookedItinerary() {
		return theBookedItinerary;
	}

	public WebElement getSearchOrderId() {
		return searchOrderId;
	}

	public WebElement getOrderNodetails() {
		return orderNodetails;
	}



	public WebElement getCancelMsg() {
		return cancelMsg;
	}

	public WebElement getSearchId() {
		return searchId;
	}

	public void cancelBookedOrder() {
		String attribute = getAttribute(getOrderNodetails());
		click(getTheBookedItinerary());
		enterValues(getSearchOrderId(), attribute);
		click(getSearchId());
click(getSelectId());
click(getCancelButton());
alertAccept();
		
	}
	
	public void cancelExistingOrder(String OrderId) {
		click(getTheBookedItinerary());
		enterValues(getSearchOrderId(), OrderId);
		click(getSearchId());
		click(getSelectId());
		click(getCancelButton());
		alertAccept();
	}
	
	
}
