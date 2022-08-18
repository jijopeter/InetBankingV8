package methosOverridingDemo;

public class ChildClass extends Parent {

	public static void main(String[] args) {
		
		ChildClass obj1=new ChildClass();
		obj1.display();
		
		Parent obj2=new Parent();
		obj2.display();
		
		Parent obj3=new ChildClass();
		obj3.display();
		//ChildClass obj3=new Parent();

	}
	public void display()
	{
		System.out.println("i am in child class display method");
		
	}
	public void display(String name)
	{
		System.out.println("i am in child class display method");
		
	}


}
