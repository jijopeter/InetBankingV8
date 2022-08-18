package seleniumrevisemousekeyboardactionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class draganddropby {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\JavaLearning\\server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/p/page3.html");
		WebElement minLabelElement = driver.findElement(By.xpath("//a[@aria-labelledby='price-min-label']"));
		Actions actions=new Actions(driver);
		actions.dragAndDropBy(minLabelElement, -50, 0).perform();
	}

}
