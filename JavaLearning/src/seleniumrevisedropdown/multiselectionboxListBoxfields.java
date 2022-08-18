package seleniumrevisedropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselectionboxListBoxfields {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\JavaLearning\\server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		WebElement multiselectbox = driver.findElement(By.id("multiselect1"));
		Select select=new Select(multiselectbox);
		select.selectByVisibleText("Volvo");
		select.selectByIndex(3);
		/*select.selectByValue("swiftx");
		select.selectByVisibleText("Hyundai");
		select.deselectByVisibleText("Hyundai");
		select.deselectByIndex(1);
		select.deselectByValue("volvox");
		select.deselectAll();
		System.out.println(select.isMultiple());*/ //true
		/*List<WebElement> options = select.getAllSelectedOptions();
		for(WebElement option:options)
		{
			System.out.println(option.getText());
		}*/
		WebElement firstselectedoption = select.getFirstSelectedOption();
		System.out.println(firstselectedoption.getText());
		driver.quit();
	}

}
