package seleniumreviseframesiframes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class multipleframewithindex {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\JavaLearning\\server\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		/*driver.switchTo().frame();
		driver.findElement(By.linkText("Description")).click();*/
		List<WebElement> frames = driver.findElements(By.tagName("frame"));
		//System.out.println(frames.size());
		int noOfFrames = frames.size();
		int s;
		int index=0;
		for(int i=0;i<noOfFrames;i++) {
			driver.switchTo().frame(i);
			s=driver.findElements(By.linkText("Description")).size();
			if(s>0) {
				index=i;
				driver.switchTo().parentFrame();
				break;
			}
			driver.switchTo().parentFrame();
		}
		driver.switchTo().frame(index);
		driver.findElement(By.linkText("Description")).click();
	}

}
