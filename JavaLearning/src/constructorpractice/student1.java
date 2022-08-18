package constructorpractice;

public class student1 {
	int result;

	public static void main(String[] args) 
	{
		student1 obj1=new student1(5,"jijo");
		obj1.displayresult();

	}
	public student1()
	{
		System.out.println("my marks are 50");
	}
	public student1(String myname)
	{
		System.out.println("i am "+ myname+" first in class");
	}
	public student1(int rank)
	{
		System.out.println("my rank is "+rank);
	}
	public student1(String myname,int rank)
	{
		System.out.println("i am "+myname+" my rank is "+rank);
	}
	public student1(int rank,String myname)
	{
		System.out.println("my rank is "+rank+" i am "+myname);
	}
	public void displayresult()
	{
		System.out.println("my result is "+result);
	}

}
