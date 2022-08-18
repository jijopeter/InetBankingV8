package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipletab {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\JavaLearning\\server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		//String tab=Keys.chord(Keys.CONTROL,Keys.RETURN);//still in the homepage
		
		//driver.findElement(By.linkText("Register")).sendKeys(tab);
		driver.switchTo().newWindow(WindowType.TAB);//in the new tab
		//driver.switchTo().newWindow(WindowType.WINDOW);//in the new window
		driver.get("https://www.youtube.com/");
		
	}

}
