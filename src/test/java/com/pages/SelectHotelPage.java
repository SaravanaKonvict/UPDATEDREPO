package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SelectHotelPage extends BaseClass {

	public SelectHotelPage() {
PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='radio']")
	private WebElement theSelect;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement theContinue;
	
	@FindBy(xpath="//td[text()='Book A Hotel ']")
	private WebElement theSuccessMsg;
	
	@FindBy(id="radiobutton_span")
	private WebElement failmsg;

	

	public WebElement getFailmsg() {
		return failmsg;
	}

	public WebElement getTheSuccessMsg() {
		return theSuccessMsg;
	}

	public WebElement getTheSelect() {
		return theSelect;
	}

	public WebElement getTheContinue() {
		return theContinue;
	}
	
	public void hotelSelect() {
		//action(getTheSelect(), "click");
		implicitWait();
		click(getTheSelect());
		click(getTheContinue());
	}
	
	public void notselect() {
		implicitWait();
		click(getTheContinue());
	}
}
