package datadrivent;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class wordpresslogin {
	WebDriver driver;
	@Test(dataProvider="wordpressdata")
	public void loginwordpress(String username,String password) throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
		driver.findElement(By.xpath("//input[@id='usernameOrEmail']")).sendKeys(username);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		//System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("My Home"),"invalid credentials");
		System.out.println("user is able to login successfully");
		
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	@DataProvider(name="wordpressdata")
	public Object[][] passdata()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="admin1";
		data[0][1]="demo";
		data[1][0]="jijopeter";
		data[1][1]="ryanjpeter";
		data[2][0]="admin2";
		data[2][1]="demo12";
		return data;
	}

}
