package compilepolymorpractice;

public class compile1 {

	public static void main(String[] args) {
		compile1 obj1=new compile1();
		obj1.add(10, 5);
		obj1.add(10,5,5);
		obj1.add(10.5,5.6);
		obj1.add(10.5, 5);
		obj1.add(10,4.5);

	}
	public void add(int a,double b)
	{
		double c=a+b;
		System.out.println("addition is 5 "+c);
	}
	public void add(double a,double b)
	{
		double c=a+b;
		System.out.println("addition is 3 "+c);
	}
	
	public void add(double a,int b)
	{
		double c=a+b;
		System.out.println("addition is 4 "+c);
	}
	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("addition is 2 "+c);
	}
	public void add(int a,int b,int d)
	{
		int c=a+b+d;
		System.out.println("addition is 1 "+c);
	}
}
