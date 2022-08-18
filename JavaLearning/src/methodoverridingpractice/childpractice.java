package methodoverridingpractice;

public class childpractice extends parent1{

	public static void main(String[] args) 
	{
		childpractice obj1=new childpractice();
		obj1.names();
		parent1 obj2=new parent1();
		obj2.names();
		parent1 obj3=new childpractice();
		obj3.names();
		//childpractice obj4=new parent1();invalid 

	}
	public void names()
	{
		System.out.println("i am in child class-names method");
	}
	public void names(String name)
	{
		System.out.println("i am in child class-names method-diff type");
	}
	

}
