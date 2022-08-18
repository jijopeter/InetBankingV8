package listpractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylist5 {

	public static void main(String[] args) {
		List<String> obj1=new ArrayList<String>();
		obj1.add("jijo");
		obj1.add("tvm");
		obj1.add("ryan");
		for(String v:obj1)
		{
			System.out.println(v);
		}
	}

}
