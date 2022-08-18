package consDemo;

public class Marks 
{
	int result;
	public static void main(String []args)
	{
		Marks m=new Marks(99);
		m.displayResult();
	}
	public Marks(int marks)
	{
		result=marks;
	}
	
	
	public void displayResult()
	{
		System.out.println("Final marks for student is "+result);
	}
	

}
