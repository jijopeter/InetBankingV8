package seleniumrevisedropdown;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class bootstrapdropdown {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\JavaLearning\\server\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		Thread.sleep(2000);
		//generic method
		By productTypeDropDown=By.xpath("//div[@class='drp1']");
		By productsDropDown=By.xpath("//div[@class='drp2']");
		selectOptionInBootstrapDropDownField(productTypeDropDown,"Accounts");
		selectOptionInBootstrapDropDownField(productsDropDown,"Savings Accounts");
		/*WebElement productTypeDropDown = driver.findElement(By.xpath("//div[@class='drp1']"));
		productTypeDropDown.click();
		WebElement accountsOption = driver.findElement(By.xpath("//li[text()='Accounts']"));
		accountsOption.click();
		WebElement productsDropDown = driver.findElement(By.xpath("//div[@class='drp2']"));
		productsDropDown.click();
		WebElement savingsAccountOption = driver.findElement(By.xpath("//li[text()='Savings Accounts']"));
		savingsAccountOption.click();*/
		
	}
	public static WebElement getWebElement(By field)
	{
		return driver.findElement(field);
	}
	public static void selectOptionInBootstrapDropDownField(By field,String optionValue) 
	{
		getWebElement(field).click();
		String xpath="//li[text()=\'"+optionValue+"\']";
		getWebElement(By.xpath(xpath)).click();
	}
}
