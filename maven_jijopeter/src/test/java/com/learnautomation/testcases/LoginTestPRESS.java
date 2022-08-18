package com.learnautomation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClassPRESS;
import com.learnautomation.pages.LoginPagePRESS;
import com.learnautomation.utility.BrowserFactory1;

public class LoginTestPRESS extends BaseClassPRESS{
	
	
	@Test
	public void loginAPP()
	{
		
		LoginPagePRESS loginPage=PageFactory.initElements(driver, LoginPagePRESS.class);
		loginPage.loginToPRESS("jijopeter","ryanjpeter");
		
	}
	

}
