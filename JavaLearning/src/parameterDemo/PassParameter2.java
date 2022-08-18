package parameterDemo;

public class PassParameter2 {

	public static void main(String[] args) 
	{
		DynamicCalculator obj1=new DynamicCalculator();
		int sum=obj1.add(455, 78);
		System.out.println("sum result is "+sum);
		double result=obj1.sub(7888.89, 45.45);
		System.out.println("substraction result is "+result);
		String fullname=DynamicCalculator.getMyFullName("jijo", "peter");
		System.out.println("congrats "+fullname);
			
	}
	

}
