package listDemo;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) 
	{
		
		ArrayList obj1=new ArrayList();
		
		obj1.add(7878787);
		obj1.add('M');
		obj1.add("Selenium Webdriver");
		obj1.add("Selenium Webdriver");
		obj1.add(12.34);
	     
		int myListSize=obj1.size();
		for(int i=0;i<myListSize;i++)
		{
			System.out.println("Values from ArrayList is "+obj1.get(i));
		}
		

	}

}
