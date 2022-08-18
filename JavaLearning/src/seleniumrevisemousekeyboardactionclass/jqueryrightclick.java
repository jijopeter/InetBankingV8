package seleniumrevisemousekeyboardactionclass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class jqueryrightclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\JavaLearning\\server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightClickMe = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions actions=new Actions(driver);
		actions.contextClick(rightClickMe).perform();
		WebElement quitOption = driver.findElement(By.xpath("//span[text()='Quit']"));
		actions.click(quitOption).perform();
		Alert alert = driver.switchTo().alert();
		String textOnAlert=alert.getText();
		System.out.println(textOnAlert);
		alert.accept();
	
	}
		
}
