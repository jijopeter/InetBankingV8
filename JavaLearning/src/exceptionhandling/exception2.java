package exceptionhandling;

import java.util.InputMismatchException;

public class exception2 {

	public static void main(String[] args) {
		
		try
		{
			int a=10/0;
			System.out.println("division result "+a);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("please check the exception "+e.getMessage());
			System.out.println("you have entered zero pls provide value >0");
		}
		catch(InputMismatchException e)
		{
			System.out.println("enter only integer values");
		}
		catch(Exception e)
		{
			System.out.println("something went wrong");
		}
		finally
		{
			System.out.println("finally block");
			System.out.println("end");
		}

	}

}
