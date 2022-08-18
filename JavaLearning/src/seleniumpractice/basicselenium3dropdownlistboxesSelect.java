package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class basicselenium3dropdownlistboxesSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\JavaLearning\\server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		WebElement dropdown=driver.findElement(By.id("month"));
		Select select=new Select(dropdown);
		//select.selectByVisibleText("Mar");
		//select.selectByValue("8");
		select.selectByIndex(8);
		if(select.isMultiple())
		{
			System.out.println("dropdown has multiple selection");
		}else {
			System.out.println("dropdown has no multiple selection");
		}

	}

}
