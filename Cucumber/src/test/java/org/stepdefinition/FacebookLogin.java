package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.LoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FacebookLogin extends BaseClass{
	LoginPojo l;
	@Given("To launch the Browser and Max the window")
	public void to_launch_the_Browser_and_Max_the_window() {
	   launchEdgeBrowser();
	   maxWindow();
	}
	@Given("To launch the Facebook Url")
	public void to_launch_the_Facebook_Url() {
	   getUrl("https://www.facebook.com/");
	}
	@Given("To pass the Valid Email to the Email text Field")
	public void to_pass_the_Valid_Email_to_the_Email_text_Field() {
	   l=new LoginPojo();
	   passText(l.getEmailTxt(),"log123");
	}
	@Given("To pass  the Valid password to the Password text field")
	public void to_pass_the_Valid_password_to_the_Password_text_field() {
	   l=new LoginPojo();
	   passText(l.getPassTxt(),"hjk456");
	}

	@Given("To click the Login Button")
	public void to_click_the_Login_Button() {
	   l=new LoginPojo();
	   clickLogin(l.getLoginBtn());
	}

	@Then("To close the Browser")
	public void to_close_the_Browser() {
	 closeTheBrowser();
	}


}
