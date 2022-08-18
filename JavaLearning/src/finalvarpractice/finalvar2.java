package finalvarpractice;

public class finalvar2 {
	final String NAME;
	public finalvar2(String name)
	{
	NAME=name;
	}

	public static void main(String[] args) {
		finalvar2 obj1=new finalvar2("ryan");
		
	}
	public void show()
	{
		System.out.println("name is "+NAME);
	}

}
