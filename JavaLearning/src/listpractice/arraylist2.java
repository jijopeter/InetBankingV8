package listpractice;

import java.util.ArrayList;

public class arraylist2 {

	public static void main(String[] args) {
		ArrayList obj1=new ArrayList();
		obj1.add(123456);
		obj1.add('j');
		obj1.add("jijo");
		obj1.add("jijo");
		obj1.add(10.55);
		
		int total=obj1.size();
		for(int i=0;i<total;i++)
		{
			System.out.println(obj1.get(i));
		}

	}

}
