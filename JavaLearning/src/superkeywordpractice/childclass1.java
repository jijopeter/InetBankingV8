package superkeywordpractice;

public class childclass1 extends parentclass{
	
	public childclass1()
	{
		System.out.println("i am in child class constructor");
	}
	public childclass1(String name)
	{
		super(name);
		System.out.println("i am in child class constructor "+name);
	}

	public static void main(String[] args) 
	{
		childclass1 obj1=new childclass1("jijo");
		

	}

}
