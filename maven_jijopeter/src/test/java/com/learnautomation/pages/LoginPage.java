package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;	
	}
	@FindBy(xpath="//a[normalize-space()='Login']")WebElement log;
	@FindBy(xpath="//input[@name='email']")WebElement uname;
	@FindBy(xpath="//input[@name='password']")WebElement pass;
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")WebElement loginButton;
	
	public void loginToCRM(String UsernameApplication,String passwordApplication)
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		log.click();
		uname.sendKeys(UsernameApplication);
		pass.sendKeys(passwordApplication);
		loginButton.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
	}

}
