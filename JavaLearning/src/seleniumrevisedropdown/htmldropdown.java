package seleniumrevisedropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class htmldropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\JavaLearning\\server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		WebElement dropdownfield = driver.findElement(By.id("drop1"));
		Select select=new Select(dropdownfield);
		/*select.selectByVisibleText("doc 3");
		select.selectByIndex(1);
		select.selectByValue("ghi");*/
		//System.out.println(select.isMultiple()); //false
		List<WebElement> options = select.getOptions();
		for(WebElement option : options)
		{
			System.out.println(option.getText());
		}
		driver.quit();
	}

}
