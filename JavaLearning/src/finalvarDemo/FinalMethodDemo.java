package finalvarDemo;

public class FinalMethodDemo extends Parent {

	public static void main(String[] args) {
		
		FinalMethodDemo obj1=new FinalMethodDemo();
		obj1.name();
		obj1.Address();
		obj1.phone();
		
		Object obj2=new Object();
	}
	
	public void Address()
	{
		System.out.println("my city is trivandrum");
	}
	public void phone()
	{
		System.out.println("my number is 1232465");
	}

}
