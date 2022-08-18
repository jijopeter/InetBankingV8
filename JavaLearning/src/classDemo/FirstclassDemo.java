package classDemo;

public class FirstclassDemo 
{
	int x=90;
	int y=100;
	

	public static void main(String[] args)
	{
		System.out.println("program started");
		FirstclassDemo obj1=new FirstclassDemo();
		obj1.sum();
		System.out.println("X values is "+obj1.x);
		System.out.println("Y values is "+obj1.y);
		System.out.println("End program");	
		
		FirstclassDemo obj2=new FirstclassDemo();
		obj2.sum();
		System.out.println("X values is "+obj2.x);
		System.out.println("Y values is "+obj2.y);
		System.out.println("End program");	

	}
	
	public void sum()
	{
		int a=90; 
		int b=100;
		int c=b+a;
		System.out.println("Sum of two numbers is "+c);
		
		
	} 

}
