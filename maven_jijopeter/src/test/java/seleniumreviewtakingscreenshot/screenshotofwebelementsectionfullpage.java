package seleniumreviewtakingscreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshotofwebelementsectionfullpage {

	public static void main(String[] args) throws IOException {
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();*/
		/*driver.get("http://omayo.blogspot.com/");
		WebElement multiSelectionBoxField = driver.findElement(By.id("multiselect1"));
		File srcFile = multiSelectionBoxField.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile, new File("./Screenshots/multi.png"));*/
		//take screenshot of section
		//driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		/*WebElement loginPage = driver.findElement(By.id("content"));
		File srcFile = loginPage.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile, new File("./Screenshots/login1.png"));
		driver.quit();*/
		//take screenshot of fullpage
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		File srcFile=driver.getFullPageScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile, new File("./Screenshots/fullpage.png"));
		driver.quit();
		

	}

}
