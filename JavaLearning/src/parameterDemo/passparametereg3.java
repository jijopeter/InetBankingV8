package parameterDemo;

public class passparametereg3 {

	public static void main(String[] args) 
	{
		dynamiceg2 obj1=new dynamiceg2();
		int add=obj1.sum(10,20);
		System.out.println("sum of the number "+add);
		double z=obj1.sub(9.15, 10.25);
		System.out.println("sub of the number "+z);
		
		String fullname=dynamiceg2.getMyFullName("jijo ","peter");
		System.out.println("my full name "+fullname);

	}
	

}
