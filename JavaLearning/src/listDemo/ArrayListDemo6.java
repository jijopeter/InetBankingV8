package listDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo6 {

	public static void main(String[] args) 
	{
		
		List<String> obj1=new ArrayList<String>();
		obj1.add("Jijo");
		obj1.add("selenium");
		obj1.add("HP QTP");
		
		for(String v:obj1)
		{
			System.out.println(v);
		}
		

	}

}
