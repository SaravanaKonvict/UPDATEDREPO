package com.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookHotelPage extends BaseClass {

	/**
	 * @author Konvict
	 * @see constructor used to initialize the driver
	 * @Date 01.01.2023
	 */
	
	public BookHotelPage() {
	
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//td[text()='Booking Confirmation ']")
	private WebElement theBookingConfirmation;
	

	public WebElement getTheBookingConfirmation() {
		return theBookingConfirmation;
	}

	@FindBy(name="first_name")
	private WebElement theFirstName;
	
	@FindBy(name="last_name")
	private WebElement theLastname;
	
	@FindBy(name="address")
	private WebElement theBillingAddress;
	
	@FindBy(name="cc_num")
	private WebElement theCreditCard;
	
	@FindBy(name="cc_type")
	private WebElement theCardType;
	
	@FindBy(name="cc_exp_month")
	private WebElement theExpiryMonth;
	
	@FindBy(name="cc_exp_year")
	private WebElement theExpiryYear;
	
	@FindBy(name="cc_cvv")
	private WebElement theCvv;
	
    @FindBy(name="book_now")  
	private WebElement theBookNow;
    
    @FindBy(id="first_name_span")
    private WebElement theFirstError;
    
   @FindBy(id="last_name_span") 
   private WebElement theLastError;
   
   @FindBy(id="address_span")
   private WebElement theBillingError;
   
   @FindBy(id="cc_num_span")
   private WebElement theCardNoError;
   
   @FindBy(id="cc_type_span")
   private WebElement theCardTypeError;
   
   @FindBy(id="cc_expiry_span")
   private WebElement theYearMonthError;
   
   @FindBy(id="cc_cvv_span")
   private WebElement theCVVError;
   
   
   
   

	public WebElement getTheFirstError() {
	return theFirstError;
}

public WebElement getTheLastError() {
	return theLastError;
}

public WebElement getTheBillingError() {
	return theBillingError;
}

public WebElement getTheCardNoError() {
	return theCardNoError;
}

public WebElement getTheCardTypeError() {
	return theCardTypeError;
}

public WebElement getTheYearMonthError() {
	return theYearMonthError;
}

public WebElement getTheCVVError() {
	return theCVVError;
}

	public WebElement getTheFirstName() {
		return theFirstName;
	}

	public WebElement getTheLastname() {
		return theLastname;
	}

	public WebElement getTheBillingAddress() {
		return theBillingAddress;
	}

	public WebElement getTheCreditCard() {
		return theCreditCard;
	}

	public WebElement getTheCardType() {
		return theCardType;
	}

	public WebElement getTheExpiryMonth() {
		return theExpiryMonth;
	}

	public WebElement getTheExpiryYear() {
		return theExpiryYear;
	}

	public WebElement getTheCvv() {
		return theCvv;
	}

	public WebElement getTheBookNow() {
		return theBookNow;
	}

    public void allOptions(String FirstName, String LastName, String BillingAddress, io.cucumber.datatable.DataTable dataTable) {
enterValues(getTheFirstName(), FirstName);
enterValues(getTheLastname(), LastName);
enterValues(getTheBillingAddress(), BillingAddress);


	List<Map<String, String>> cc = dataTable.asMaps();
	Map<String, String> m = cc.get(0);
	String s1 = m.get("CreditCardNo");
	String s2 = m.get("CVVNumber");
	String s3 = m.get("CreditCardType");
	String s4 = m.get("ExpiryMonth");
	String s5 = m.get("ExpiryYear");
	enterValues(getTheCreditCard(), s1);
	enterValues(getTheCvv(), s2);
selectbytext(getTheCardType(), s3);
selectbytext(getTheExpiryMonth(), s4);
selectbytext(getTheExpiryYear(), s5);
click(getTheBookNow());
implicitWait();

	}
	
     
    
    public void noOptions() {
click(getTheBookNow());
	}
    
}
