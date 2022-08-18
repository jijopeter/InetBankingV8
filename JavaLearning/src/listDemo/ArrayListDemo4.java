package listDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo4 {

	public static void main(String[] args) 
	{
		
		ArrayList obj1=new ArrayList();
		
		obj1.add(7878787);
		obj1.add('M');
		obj1.add("Selenium Webdriver");
		obj1.add("Selenium Webdriver");
		obj1.add(12.34);
	    
		Iterator itr=obj1.iterator();
		
		while(itr.hasNext())
		{
			Object value=itr.next();
			System.out.println("Value are "+value);
		}

	}

}
