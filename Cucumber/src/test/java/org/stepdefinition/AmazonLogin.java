package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.junit.Assert;
import org.pojo.AmazonPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;

public class AmazonLogin extends BaseClass {
	AmazonPojo a;

	@Given("Launch Browser and Max window")
	public void launch_Browser_and_Max_window() {
		launchBrowser();
		maxWindow();
	}
	@Given("To launch the Amazon Url")
	public void to_launch_the_Amazon_Url() {
		getUrl("https://www.amazon.in/");
	}
	@Given("To click the signin button")
	public void to_click_the_signin_button() {
		a = new AmazonPojo();
		clickLogin(a.getSignin());
	}
	@Given("To pass the Value in Email or Mobile text Field")
	public void to_pass_the_Value_in_Email_or_Mobile_text_Field(DataTable d) {
		a = new AmazonPojo();
		Map<String,String> as = d.asMap(String.class,String.class);
		passText(a.getEmail(),as.get("email2"));
	}
	@Given("To click the continue button")
	public void to_click_the_continue_button() {
		a = new AmazonPojo();
		clickLogin(a.getContinuebtn());
		Assert.assertTrue(false);
	}
	@Given("To pass  password value in the Password text field")
	public void to_pass_password_value_in_the_Password_text_field(DataTable d) {
		a=new AmazonPojo();
		List<Map<String, String>> m = d.asMaps();
		passText(a.getPassword(),m.get(1).get("password2"));
	}
	@Given("To click the Signin Button")
	public void to_click_the_Signin_Button() {
		a = new AmazonPojo();
		clickLogin(a.getSigninbtn());
	}
	@Then("Close the Browser")
	public void close_the_Browser() {
		closeTheBrowser();
	}
}
