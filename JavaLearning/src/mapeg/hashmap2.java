package mapeg;

import java.util.HashMap;
import java.util.Map;

public class hashmap2 {

	public static void main(String[] args) {
		HashMap<String, String> obj1=new HashMap<String, String>();
		obj1.put("11", "india");
		obj1.put("2", "Usa");
		obj1.put("31", "england");
		obj1.put("4", "russia");
		obj1.put("51", "china");
		obj1.put("6", "australia");
		obj1.put("6", "australia");
		
		for(Map.Entry<String, String> data:obj1.entrySet())
		{
			System.out.println("key from map is "+data.getKey()+ " and value is "+data.getValue());
		}

	}

}
