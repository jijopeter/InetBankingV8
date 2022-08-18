package finalvarpractice;

public class finalmethod1 extends finalmethodparent{

	public static void main(String[] args) {
		finalmethod1 obj1=new finalmethod1();
		obj1.rollno();
		obj1.contactno();
		obj1.class1();
		Object obj2=new Object();

	}
	
	public void rollno()
	{
		System.out.println("my rollno is 11");
	}
	public void contactno()
	{
		System.out.println("contact no is 987");
	}

}
