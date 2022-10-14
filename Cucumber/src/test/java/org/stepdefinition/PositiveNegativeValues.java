package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.LoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class PositiveNegativeValues extends BaseClass {
	LoginPojo l;
	@Given("Launch the Browser and Max the window")
	public void launch_the_Browser_and_Max_the_window() {
	    launchBrowser();
	    maxWindow();
	}
	@Given("Launch the Facebook Url")
	public void launch_the_Facebook_Url() {
	    getUrl("https://www.facebook.com/");
	}
	@Given("pass the positive and negative {string} to the Email text Field")
	public void pass_the_positive_and_negative_to_the_Email_text_Field(String emailId) {
		l=new LoginPojo();
	 passText(l.getEmailTxt(), emailId);
	}
	@Given("pass the positive and negative {string}to the Password text field")
	public void pass_the_positive_and_negative_to_the_Password_text_field(String passwordId) {
		l=new LoginPojo();
		 passText(l.getPassTxt(), passwordId);
	}
	@Given("click the Login Button")
	public void click_the_Login_Button() {
		l=new LoginPojo();
		 clickLogin(l.getLoginBtn());
	}
	@Then("close the Browser")
	public void close_the_Browser() {
	   closeTheBrowser();
	}
}
