package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_id_name {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\JavaLearning\\server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement emailaddress=driver.findElement(By.name("email"));
		WebElement password=driver.findElement(By.name("pass"));
		WebElement loginbutton=driver.findElement(By.name("login"));
		
		emailaddress.sendKeys("jijopeter");
		password.sendKeys("123456");
		loginbutton.click();

	}

}
