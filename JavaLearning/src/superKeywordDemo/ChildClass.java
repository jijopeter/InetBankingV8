package superKeywordDemo;

public class ChildClass extends BaseClass{
	int int_rate=10;
	

	public static void main(String[] args) 
	{
		ChildClass obj1=new ChildClass();
		obj1.showmeIntRateFromPvtBank(); 
		
	}
	public void showmeIntRate()
	{
		System.out.println("i am in child class");
	}

	public void showmeIntRateFromPvtBank()
	{
		super.showmeIntRate();
		
		System.out.println("current int rate from Private Bank is "+super.int_rate);
	}
}
