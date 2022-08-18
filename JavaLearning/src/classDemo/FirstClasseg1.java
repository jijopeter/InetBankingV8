package classDemo;

public class FirstClasseg1 {
	
	int a=10;
	int b=20;

	public static void main(String[] args) 
	{
		FirstClasseg1 obj1=new FirstClasseg1();
		obj1.sum();
		System.out.println("value of a "+obj1.a);
		System.out.println("value of b "+obj1.b);
		
		FirstClasseg1 obj2=new FirstClasseg1();
		obj2.sum();
		System.out.println("value of a "+obj2.a);
		System.out.println("value of b "+obj2.b);
	}
	public void sum()
	{
	int c=30;
	int d=10;
	int e=c+d;
	System.out.println("sum of c&d "+e);
	}
}
