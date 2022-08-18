package thiskeywordpractice;

public class variables1 {
	int a;
	double b;
	
	public variables1(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public variables1(int x,double y)
	{
		this.a=x;
		this.b=y;
	}
	
	public void add()
	{
		double c=a+b;
		System.out.println("sum of this number "+c);
	}

	public static void main(String[] args) {
		variables1 obj1=new variables1(10,30);
		obj1.add();
		

	}

}
