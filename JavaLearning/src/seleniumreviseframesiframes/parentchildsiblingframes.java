package seleniumreviseframesiframes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class parentchildsiblingframes {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\JavaLearning\\server\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		//switch to parent top frame
		driver.switchTo().frame("frame-top");
		//switch to child left frame
		driver.switchTo().frame("frame-left");
		String leftFrameText=driver.findElement(By.xpath("//body")).getText();
		System.out.println(leftFrameText);
		//switch to parent top frame
		driver.switchTo().parentFrame();
		//switch to child middle frame
		driver.switchTo().frame("frame-middle");
		String middleFrametext=driver.findElement(By.id("content")).getText();
		System.out.println(middleFrametext);
		//switch to parent top frame
		driver.switchTo().parentFrame();
		//switch to child right frame
		driver.switchTo().frame("frame-right");
		String rightFrameText=driver.findElement(By.xpath("//body")).getText();
		System.out.println(rightFrameText);
		//switch back directly to the page level
		driver.switchTo().defaultContent();
		//switch to parent bottom frame
		driver.switchTo().frame("frame-bottom");
		String bottomFrameText=driver.findElement(By.xpath("//body")).getText();
		System.out.println(bottomFrameText);
				
	}

}
