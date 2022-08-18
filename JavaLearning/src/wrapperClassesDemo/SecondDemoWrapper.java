package wrapperClassesDemo;

public class SecondDemoWrapper {

	public static void main(String[] args) {
		
		String price1="463";
		
		String price2="237";
		//int result=price1+price2;
		//System.out.println(price1+price2);

		int p1=Integer.parseInt(price1);
		int p2=Integer.parseInt(price2);
		
		int sum=p1+p2;
		
		if(sum==700)
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
	}

}
