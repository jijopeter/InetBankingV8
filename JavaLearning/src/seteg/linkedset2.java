package seteg;


import java.util.LinkedHashSet;


public class linkedset2 {

	public static void main(String[] args) {
		LinkedHashSet<String> values=new LinkedHashSet<>();
		values.add("babu");
		values.add("akshaya");
		values.add("qazi");
		values.add("bhanu");
		values.add("sirisha");
		values.add("1");
		values.add("abc");
		
		for(String e:values)
		{
			System.out.println(e);
		}

	}

}
