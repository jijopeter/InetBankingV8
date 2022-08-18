package testcasetoscript;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class titleofpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\JavaLearning\\server\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println("the title of the page is "+title);
		driver.close();
	}

}
