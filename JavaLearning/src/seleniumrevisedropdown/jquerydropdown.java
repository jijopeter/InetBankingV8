package seleniumrevisedropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jquerydropdown {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\JavaLearning\\server\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		/*single selection
		WebElement singleSelectionDropDownField = driver.findElement(By.id("justAnotherInputBox"));
		singleSelectionDropDownField.click();
		WebElement choice3Option = driver.findElement(By.xpath("(//span[text()='choice 3'])[3]"));
		choice3Option.click();*/
		//multi selection
		By multiSelectionDropDownFiled=By.id("justAnInputBox");
		driver.findElement(multiSelectionDropDownFiled).click();
		/*driver.findElement(By.xpath("(//span[contains(text(),'choice 1')])[1]")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'choice 2 2')])[1]")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'choice 3')])[1]")).click();*/
		//selecting all options
		List<WebElement> alloptions = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		for(WebElement option : alloptions)
		{
			try{
				option.click();
			}catch(Exception e) {
				
			}
		}

	}

}
