package listpractice;

import java.util.ArrayList;

public class arraylist3 {

	public static void main(String[] args) {
		ArrayList obj1=new ArrayList();
		obj1.add(123456);
		obj1.add('j');
		obj1.add("jijo");
		obj1.add("jijo");
		obj1.add(10.55);
		
		for(Object total:obj1)
		{
			System.out.println("total values are "+total);
		}

	}

}
