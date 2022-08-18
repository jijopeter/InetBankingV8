package listpractice;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist4 {

	public static void main(String[] args) {
		ArrayList obj1=new ArrayList();
		obj1.add(123456);
		obj1.add('j');
		obj1.add("jijo");
		obj1.add("jijo");
		obj1.add(10.55);
		
		Iterator iter=obj1.iterator();
		while(iter.hasNext())
		{
			Object abc=iter.next();
			System.out.println("value are "+abc);
		}
	}

}
