package testcasetoscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testscenariosActions1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\JavaLearning\\server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://bar-and-shield-sandbox.mybigcommerce.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#guestTkn")).sendKeys("zjo34kbkfp");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("div[class='recaptcha-checkbox-border']")).click();
		Thread.sleep(8000);
		driver.switchTo().parentFrame();
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		System.out.println("title is "+driver.getTitle());
		
		
		driver.findElement(By.xpath("//button[@class='navUser-action']//img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='link-9b255c78-5909-46da-b519-3f05c3f5c067']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@title='Harley-Davidson® Motor Jacket']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='attribute_rectangle_151_185']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id=form-action-addToCart]")).click();
		Thread.sleep(4000);
		
		/*JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,8000)");*/
	}

}
