package inheritancepractice;

public class childclasspract3 extends baseclasspract
{

	public static void main(String[] args) 
	{
		baseclasspract obj1=new childclasspract3();
		obj1.marks();
		obj1.count();
		
		

	}
	public void id()
	{
		System.out.println("i am in child ID");
	}
	public void code()
	{
		System.out.println("i am in child code");
	}

}
