package org.pojo;

import java.sql.Driver;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPojo extends BaseClass {
public AmazonPojo() {
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//a[@id='nav-link-accountList']")
private WebElement signin;

@FindBy(id="ap_email")
private WebElement email;

@FindBy(id="continue")
private WebElement continuebtn;

@FindBy(id="ap_password")
private WebElement password;

@FindBy(id="signInSubmit")
private WebElement signinbtn;

//Getters
public WebElement getSignin() {
	return signin;
}

public WebElement getEmail() {
	return email;
}

public WebElement getContinuebtn() {
	return continuebtn;
}

public WebElement getPassword() {
	return password;
}

public WebElement getSigninbtn() {
	return signinbtn;
}	
}
