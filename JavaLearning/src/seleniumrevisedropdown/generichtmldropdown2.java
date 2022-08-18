package seleniumrevisedropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class generichtmldropdown2 {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\JavaLearning\\server\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		//driver.findElement(By.id("fruits"));
		By fruits = By.id("fruits");
		By languages=By.id("lang");
		By heros=By.id("superheros");
		/*Select select1=new Select(driver.findElement(fruits));
		select1.selectByVisibleText("Orange");
		Select select2=new Select(driver.findElement(language));
		select2.selectByVisibleText("Java");*/
		//generic method
		selectOptionInDropDownField(fruits,"visibletext","Orange");
		selectOptionInDropDownField(languages,"index","2");
		selectOptionInDropDownField(heros,"value","ca");
		
	}
	public static WebElement getWebElement(By field)
	{
		return driver.findElement(field);
	}
	public static void selectOptionInDropDownField(By field,String optionType,String optionValue)
	{
		Select select=new Select(getWebElement(field));
		switch(optionType)
		{
		case "visibletext":
			select.selectByVisibleText(optionValue);
			break;
		case "index":
			select.selectByIndex(Integer.parseInt(optionValue));
			break;
		case "value":
			select.selectByValue(optionValue);
			break;
		}
	}
	

}
