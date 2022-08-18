package seteg;

import java.util.HashSet;
import java.util.Set;

public class set1 {

	public static void main(String[] args) {
		Set<String> values=new HashSet<>();
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
