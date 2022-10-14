package org.stepdefinition;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookClass extends BaseClass {

	@Before
	public void preCondition1() {
		launchBrowser();
		System.out.println("Launch the browser");
	}
	@Before
	public void preCondition2() {
		maxWindow();
		System.out.println("Max the window");
	}
	@After(value="@sanity")
	public void postCondition1() {
		System.out.println("Take Screenshot");
	}
	@After
	public void postCondition2() {
		closeTheBrowser();
		System.out.println("Close the browser");
	}
}
