package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicselenium4isdisplayedisselectedisenabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\JavaLearning\\server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		//verify the element is displayed or not
		/*WebElement label=driver.findElement(By.name("lastname"));
		if(label.isDisplayed())
		{
			System.out.println("label is displayed on the web page");
		}else {
			System.out.println("label is not displayed on the web page");
		}*/
		WebElement radio=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]/span[1]/span[1]/input[1]"));
		radio.click();
		if(radio.isSelected())
		{
			System.out.println("radio button is selected");
		}else {
			System.out.println("radio button is not selected");
		}
		WebElement button=driver.findElement(By.name("websubmit"));
		if(button.isEnabled()) {
			System.out.println("login button is enabled");
		}else {
			System.out.println("login button is not enabled");
		}

	}

}
