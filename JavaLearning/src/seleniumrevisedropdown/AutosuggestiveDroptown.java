package seleniumrevisedropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutosuggestiveDroptown {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\JavaLearning\\server\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		//to avoid login popup, mouse click to some other area to remove the popup
		/*WebElement logo = driver.findElement(By.xpath("//a[@class='mmtLogo makeFlex']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(logo).click().build().perform();*/
		driver.findElement(By.id("fromCity")).click();
		WebElement fromfield = driver.findElement(By.xpath("//input[@placeholder='From']"));
		fromfield.sendKeys("tvm");
		for(int i=1;i<=6;i++) {
			Thread.sleep(2000);
			fromfield.sendKeys(Keys.ARROW_DOWN);
		}
		fromfield.sendKeys(Keys.ENTER);

	}

}
