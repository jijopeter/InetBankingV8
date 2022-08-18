package inheritancepractice;

public class childclasspract1 extends baseclasspract
{

	public static void main(String[] args) 
	{
		childclasspract1 obj1=new childclasspract1();
		obj1.marks();
		obj1.count();
		obj1.id();
		obj1.code();
		

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
