package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_css {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\JavaLearning\\server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.cssSelector("input[id=email]")).sendKeys("jijopeter");
		//driver.findElement(By.cssSelector("#email")).sendKeys("i am in css #email");
		String op=driver.findElement(By.cssSelector(".fb_logo")).getTagName();
		System.out.println(op);
		//driver.findElement(By.cssSelector("input[id=pass][name=pass]")).sendKeys("i am in pass");
		//driver.findElement(By.cssSelector("input[id^=em]")).sendKeys("i am in concatinate ^em");
		//driver.findElement(By.cssSelector("input[id$=il]")).sendKeys("i am in dollar $il");
		//driver.findElement(By.cssSelector("input[id*=mai]")).sendKeys("i am in contains *mai");
		//driver.close();
		driver.quit();
	}

}
