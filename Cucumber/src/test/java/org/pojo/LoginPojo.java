package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{
	public LoginPojo() {
		PageFactory.initElements(driver,this);
	}


	@FindBy(id="email")
	private WebElement emailTxt;


	@FindBy(id="pass")
	private WebElement passTxt;


	@FindAll({
		@FindBy(id="u_0_5_/L"),
		@FindBy(xpath="//button[@data-testid='royal_login_button']"),
		@FindBy(xpath="//button[text()='Log In']")
	})
	private WebElement loginBtn;
		

	//Getters

	public WebElement getEmailTxt() {
		return emailTxt;
	}

	public WebElement getPassTxt() {
		return passTxt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
}
