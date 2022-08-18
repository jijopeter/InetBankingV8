package classobjectmethod;

public class firstclass {
	int d=20;
	int e=10;

	public static void main(String[] args) {
		firstclass obj1=new firstclass();
		obj1.sum();
		System.out.println("value of d "+obj1.d);
		System.out.println("value of e "+obj1.e);
		
		firstclass obj2=new firstclass();
		obj2.sum();
		System.out.println("value of d "+obj2.d);
		System.out.println("value of e "+obj2.e);
		

	}
	public void sum()
	{
		int a=10;
		int b=15;
		int c=a+b;
		System.out.println("sum of two numbers "+c);
	}

}
