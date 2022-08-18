package seleniumreviewtakingscreenshot;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshotusingrobotclassurlalerts {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.id("alert1")).click();
		Thread.sleep(1000);
		Robot robot=new Robot();
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle=new Rectangle(d);
		BufferedImage bufferredImage = robot.createScreenCapture(rectangle);
		String destinationPath = System.getProperty("user.dir")+"//Screenshots//robottwo.png";
		ImageIO.write(bufferredImage,"png",new File(destinationPath));
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.quit();
		

	}

}
