package thiskeywordpractice;

public class drivers1 {
	public drivers1()
	{
		this("jijo");
		System.out.println("drivers in computer ");
	}
	public drivers1(String name)
	{
		this(128);
		System.out.println("drivers in computer name "+name);
	}
	public drivers1(int size)
	{
		System.out.println("drivers in computer size"+size);
	}
	public void display()
	{
		System.out.println("i am in display");
	}

	public static void main(String[] args) {
		drivers1 obj1=new drivers1();
		obj1.display();
		
		
		

	}

}
