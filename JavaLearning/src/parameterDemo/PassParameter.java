package parameterDemo;

public class PassParameter {

	public static void main(String[] args) 
	{
		PassParameter obj1=new PassParameter();
		obj1.add(455, 78);
		obj1.sub(789.65, 56.65);
			
	}
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("HEy Result is "+c);	
	}
	public void sub(double x,double y)
	{
		double result=x-y;
		
		System.out.println("Hey Sub result is "+result);
	}

}
