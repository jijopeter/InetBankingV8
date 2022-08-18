package inheritancepractice;

public class childclasspract2 extends baseclasspract
{

	public static void main(String[] args) 
	{
		baseclasspract obj1=new baseclasspract();
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
