package seleniumrevisemousekeyboardactionclass;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class keyboardsendkeyspauseclickwebelement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\JavaLearning\\server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		driver.findElement(By.id("input-firstname")).sendKeys("jijo");
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1)).sendKeys("peter")
			.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1)).sendKeys("jijopeter@mailinator.com")
			.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1)).sendKeys("12345")
			.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1)).sendKeys("123456")
			.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1)).sendKeys("123456")
			.sendKeys(Keys.TAB).sendKeys(Keys.TAB)
			.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1)).sendKeys(Keys.SPACE)
			.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
	
	}
		
}
