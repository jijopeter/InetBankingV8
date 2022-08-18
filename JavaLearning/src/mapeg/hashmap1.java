package mapeg;

import java.util.HashMap;

public class hashmap1 {

	public static void main(String[] args) {
		HashMap<String, String> obj1=new HashMap<String, String>();
		obj1.put("11", "india");
		obj1.put("2", "Usa");
		obj1.put("31", "england");
		obj1.put("4", "russia");
		obj1.put("51", "china");
		obj1.put("6", "australia");
		obj1.put("6", "australia");
		
		System.out.println(obj1);
		String value=obj1.get("4");
		System.out.println("values from map "+value);

	}

}
