package seleniumrevisemousekeyboardactionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class movingmouse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\JavaLearning\\server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		WebElement blogsMenuElement = driver.findElement(By.id("blogsmenu"));
		Actions actions=new Actions(driver);
		actions.moveToElement(blogsMenuElement).perform();
		WebElement option2 = driver.findElement(By.linkText("SeleniumByArun"));
		actions.moveToElement(option2).click().build().perform();
		//actions.click().perform();
		

	}

}
