package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();

	}
public static void launchEdgeBrowser() {
		
		WebDriverManager.edgedriver().setup();
		
		driver=new EdgeDriver();

	}
	public static void maxWindow() {
		driver.manage().window().maximize();

	}
	public static void getUrl(String url) {
		driver.get(url);
	}
	public static void passText(WebElement ele,String value) {
		ele.sendKeys(value);
	}
	public static void clickLogin(WebElement ele) {
		ele.click();
	}	
	public static void newUser(WebElement ele) {
		ele.click();
	}
	public static String pageTitle() {
		String title = driver.getTitle();
		return title;

	}
	public static void closeTheBrowser() {
		driver.quit();

	}
}
