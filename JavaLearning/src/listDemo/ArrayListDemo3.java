package listDemo;

import java.util.ArrayList;

public class ArrayListDemo3 {

	public static void main(String[] args) 
	{
		
		ArrayList obj1=new ArrayList();
		
		obj1.add(7878787);
		obj1.add('M');
		obj1.add("Selenium Webdriver");
		obj1.add("Selenium Webdriver");
		obj1.add(12.34);
	     
		for(Object abc:obj1)
		{
			System.out.println("values are "+abc);
		}

	}

}
