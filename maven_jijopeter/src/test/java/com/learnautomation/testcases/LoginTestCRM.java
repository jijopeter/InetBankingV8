package com.learnautomation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.BrowserFactory;
import com.learnautomation.utility.ExcelDataProvider;
import com.learnautomation.utility.Helper;

public class LoginTestCRM extends BaseClass{
	
	@Test
	public void loginApp() 
	{
		
		//excel.getStringdata("Login", 0, 0);
		LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
		loginpage.loginToCRM(excel.getStringdata("Login", 0, 0),excel.getStringdata("Login", 0, 1));
		
	}
	

}
