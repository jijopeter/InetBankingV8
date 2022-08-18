package seleniumreviewtakingscreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class takeScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		//take screenshot here
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		/*File destinationFile = new File("./Screenshots/omayo.png");
		FileUtils.copyFile(srcFile, destinationFile);*/
		//use new method
		//FileUtils.copyFile(srcFile, new File("./Screenshots/omayo.png"));
		FileHandler.copy(srcFile, new File("./Screenshots/omayo.png"));
		
		driver.findElement(By.linkText("compendiumdev")).click();
		File srcFile2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile2, new File("./Screenshots/basic.png"));
		//FileUtils.copyFile(srcFile2, new File("./Screenshots/basic.png"));
		driver.quit();

	}

}
