package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class basicselenium7tooltip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\JavaLearning\\server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		WebElement link1=driver.findElement(By.linkText("Sign Up"));
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)");
		try {
			Thread.sleep(1000);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		Actions action=new Actions(driver);
		action.moveToElement(link1).perform();
		String tooltip=link1.getAttribute("title");
		
		System.out.println("verify the tooltip "+ tooltip);
	
		
	}
		

	}

