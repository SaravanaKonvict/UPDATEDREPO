package com.pages;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Login extends BaseClass {

	public Login() {
	
		PageFactory.initElements(driver, this);	
	}
	@FindBy(id = "username")
	private WebElement txtUserName;
	
	@FindBy(id = "password")
	private WebElement txtPassword;

	@FindBy(id = "login")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//b[text()='Invalid Login details or Your Password might have expired. ']")
	private WebElement txtErrorMsg;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public void setTxtUserName(WebElement txtUserName) {
		this.txtUserName = txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public void setTxtPassword(WebElement txtPassword) {
		this.txtPassword = txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(WebElement btnLogin) {
		this.btnLogin = btnLogin;
	}

	public WebElement getTxtErrorMsg() {
		return txtErrorMsg;
	}

	public void setTxtErrorMsg(WebElement txtErrorMsg) {
		this.txtErrorMsg = txtErrorMsg;
	}
	
	public void normalLogin(String userName, String password) {
		enterValues(getTxtUserName(), userName);
		enterValues(getTxtPassword(), password);
	click(getBtnLogin());
	}
	
	public void loginWithEnter(String userName, String password) throws AWTException {
		enterValues(getTxtUserName(), userName);
		enterValues(getTxtPassword(), password);
		robotkeypress(KeyEvent.VK_ENTER);
		robotkeyrelease(KeyEvent.VK_ENTER);
		
	}
	
	public void invalidLogin(String userName, String password) {
		enterValues(getTxtUserName(), userName);
		enterValues(getTxtPassword(), password);
	}
}
