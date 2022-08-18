package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPagePRESS {
	WebDriver driver;
	public LoginPagePRESS(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	@FindBy(xpath="//input[@id='usernameOrEmail']") WebElement uname;
	@FindBy(xpath="//button[@type='submit']") WebElement submit;
	@FindBy(xpath="//input[@id='password']") WebElement pass;
	@FindBy(xpath="//button[@type='submit']") WebElement loginButton;
	
	public void loginToPRESS(String usernameApplication,String passwordApplication)
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		uname.clear();
		uname.sendKeys(usernameApplication);
		submit.click();
		pass.clear();
		pass.sendKeys(passwordApplication);
		loginButton.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
	}
	

}
