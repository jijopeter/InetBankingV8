package parameterDemo;

public class passparametereg2 {

	public static void main(String[] args) 
	{
		passparametereg2 obj1=new passparametereg2();
		int add=obj1.sum(10,20);
		System.out.println("sum of the number "+add);
		double z=obj1.sub(9.15, 10.25);
		System.out.println("sub of the number "+z);

	}
	public int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public double sub(double x,double y)
	{
		double z=y-x;
		return z;
	}

}
