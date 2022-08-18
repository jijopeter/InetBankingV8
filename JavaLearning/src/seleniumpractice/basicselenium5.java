package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicselenium5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\JavaLearning\\server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");
		/*WebElement checkbox1=driver.findElement(By.xpath("//input[@value='Bike']"));
		checkbox1.click();*/
		/*List<WebElement> list=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement element:list) {
			
			if(element.isSelected()) {
				System.out.println("check box is already selected "+element.getAttribute("value"));
			}else {
				element.click();
				System.out.println("check box is selected now "+element.getAttribute("value"));
			}
		}*/
		/*driver.get("https://www.facebook.com/r.php");
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();*/
		driver.get("https://www.facebook.com/r.php");
		WebElement radio1=driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
		radio1.click();
		if(radio1.isSelected())
		{
			System.out.println(radio1.getAttribute("name") +" radio is already selected");
		}else {
			radio1.click();
			System.out.println(radio1.getAttribute("name") +" radio button is selected now");
		}
		
		
	}
		
		
		

	}

