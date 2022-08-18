package seleniumpractice;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicActions {
	WebDriver driver;
	String URL;

	@Before
	public void setUp() throws Exception {
		driver=new FirefoxDriver();
		URL="https://learn.letskodeit.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	@Test
	public void test() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\JavaLearning\\server\\geckodriver.exe");
		driver.get(URL);
		driver.findElement(By.xpath("//div[@id='navbar']//a[@href='/sign_in']")).click();
	}

	@After
	public void tearDown() throws Exception {
	}

	

}
