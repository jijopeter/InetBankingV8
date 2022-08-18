package seleniumrevisemousekeyboardactionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class doubleclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\JavaLearning\\server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		WebElement doubleClickOption = driver.findElement(By.id("testdoubleclick"));
		Actions actions=new Actions(driver);
		actions.doubleClick(doubleClickOption).perform();
		
	}

}
