package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.learnautomation.utility.BrowserFactory1;

public class BaseClassPRESS {
	public WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver=BrowserFactory1.startApplication(driver, "Chrome", "https://wordpress.com/log-in");
	}
	@AfterClass
	public void tearDown()
	{
		BrowserFactory1.quitBrowser(driver);
	}

}
