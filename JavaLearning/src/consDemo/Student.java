package consDemo;

public class Student 
{
	int result;
	public static void main(String []args)
	{
		Student obj1=new Student(1);
		obj1.displayResult();
	}
	public Student()
	{
		System.out.println("hey welcome to school");
	}
	public Student(String schoolName)
	{
		System.out.println("hey welcome to "+ schoolName +" school");
	}
	public Student(int rank)
	{
		System.out.println("hey welcome to school which ranked "+rank);
	}
	public Student(String schoolName,int rank)
	{
		System.out.println("hey welcome to school");
	}
	public Student(int rank,String schoolName)
	{
		System.out.println("hey welcome to school");
	}
	
	
	public void displayResult()
	{
		System.out.println("Final marks for student is "+result);
	}
	

}
