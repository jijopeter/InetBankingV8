package exceptionhandling;

public class exception1 {

	public static void main(String[] args) {
		
		try
		{
			int a=10/0;
			System.out.println("division result "+a);
		}catch(ArithmeticException e)
		{
			System.out.println("please check the exception "+e.getMessage());
			System.out.println("you have entered zero pls provide value >0");
		}

	}

}
