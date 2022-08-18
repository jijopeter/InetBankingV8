package seteg;


import java.util.ArrayList;
import java.util.LinkedHashSet;


public class convertsettolist {

	public static void main(String[] args) {
		LinkedHashSet<String> values=new LinkedHashSet<>();
		values.add("babu");
		values.add("akshaya");
		values.add("qazi");
		values.add("bhanu");
		values.add("sirisha");
		values.add("1");
		values.add("abc");
		
		ArrayList<String> list=new ArrayList<>(values);
		System.out.println(list.get(4));

	}

}
