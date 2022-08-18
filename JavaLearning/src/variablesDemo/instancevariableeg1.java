package variablesDemo;

public class instancevariableeg1 {
	
	String name;
	int marks;
	double code;
	char first_letter;
	int x=100;
	

	public static void main(String[] args) 
	{
		instancevariableeg1 obj1=new instancevariableeg1();
		obj1.print();
		System.out.println(obj1.name);
		System.out.println(obj1.x);
	}
	public void print()
	{
		int x=0;
		System.out.println("my name is "+name +" "+ "and my mark is "+marks);
		System.out.println("my code is "+code);
		System.out.println("my first letter is "+first_letter);
		System.out.println(x);
	}

}
