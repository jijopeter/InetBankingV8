package parameterDemo;

public class passparametereg1 {

	public static void main(String[] args) 
	{
		passparametereg1 obj1=new passparametereg1();
		obj1.sum(10,20);
		obj1.sub(10.15, 10);

	}
	public void sum(int a,int b)
	{
		int c=a+b;
		System.out.println("addition of this number "+c);
	}
	public void sub(double x,double y)
	{
		double z=y-x;
		System.out.println("subtraction of this "+z);
	}

}
