package seleniumpractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlebrowserwindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\JavaLearning\\server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//getWindowHandle
		//String windowid=driver.getWindowHandle();//return id of the single browser window
		//System.out.println(windowid);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();//opens child window
		//getWindowHandles
		Set<String> windowids=driver.getWindowHandles(); //return ids of multiple windows
		//first method iterator
		/*Iterator<String> it=windowids.iterator();
		String parentwindowid=it.next();
		String childwindowid=it.next();
		System.out.println("parent window id "+parentwindowid);
		System.out.println("child window id "+childwindowid);*/
		
		//second method -using list/ArrayList
		List<String> windowsidslist=new ArrayList(windowids);//convert set to list
		/*String parentwindowid=windowsidslist.get(0);//parent window id
		String childwindowid=windowsidslist.get(1);//child window id
		System.out.println("parent window id "+parentwindowid);
		System.out.println("child window id "+childwindowid);
		
		//how to use window ids for switching
		driver.switchTo().window(parentwindowid);
		System.out.println("parent window title "+driver.getTitle());
		driver.switchTo().window(childwindowid);
		System.out.println("child window title "+driver.getTitle());*/
		
		//for each loop
		for(String winid:windowsidslist)
		{
			//System.out.println(winid);
			String title=driver.switchTo().window(winid).getTitle();
			System.out.println(title);
		}
		

	}

}
