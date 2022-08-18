package CompilePolyMorphism;

public class CompileDemo1 {

	public static void main(String[] args) {
		CompileDemo1 obj1=new CompileDemo1();
		obj1.add(45, 45);
		obj1.add(78, 89, 45);
		obj1.add(45, 7889.23);
		obj1.add(45.45, 78.78);
		obj1.add(45.12, 999); 

	}
	public void add(double a,int b)
	{
		double sum=a+b;
		System.out.println("sum of number is "+sum);
		
	}
	public void add(int a,double b)
	{
		double sum=a+b;
		System.out.println("sum of number is "+sum);
		
	}
	
	public void add(double a,double b)
	{
		double c=a+b;
		System.out.println("sum of number is "+c);
		
	}
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("sum of number is "+c);
		
	}
	public void add(int a,int b,int d)
	{
		int c=a+b+d;
		System.out.println("sum of number is "+c);
	}

}
