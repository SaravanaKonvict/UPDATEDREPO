package com.pagemanager;

import com.pages.BookHotelPage;
import com.pages.CancelBookingPage;
import com.pages.Login;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;
import com.stepdefinition.HooksClass;

public class PageObjectManager {

	private Login loginPage;
private SearchHotelPage searchHotelPage;
private SelectHotelPage selectHotelPage;
private BookHotelPage bookHotelPage;
private CancelBookingPage cancelBookingPage;
private HooksClass hooksClass;



	public HooksClass getHooksClass() {
	return (hooksClass == null) ? hooksClass = new HooksClass() : hooksClass;
}


	public CancelBookingPage getCancelBookingPage() {
	return (cancelBookingPage == null) ? cancelBookingPage = new CancelBookingPage() : cancelBookingPage;
}


	public BookHotelPage getBookHotelPage() {
	return (bookHotelPage == null) ? bookHotelPage = new BookHotelPage() : bookHotelPage;
}


	public SelectHotelPage getSelectHotelPage() {
	return (selectHotelPage == null) ? selectHotelPage = new SelectHotelPage() : selectHotelPage;
}


	public Login getLoginPage() {
		return (loginPage == null) ? loginPage = new Login() : loginPage;
	}


	public SearchHotelPage getSearchHotelPage() {
		return (searchHotelPage == null) ? searchHotelPage = new SearchHotelPage() : searchHotelPage; 
	}

	
	
	
	
}
