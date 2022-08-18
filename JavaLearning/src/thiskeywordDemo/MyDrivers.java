package thiskeywordDemo;

public class MyDrivers {
	
	public MyDrivers()
	{
		this("JDBC");
		System.out.println("loading my drivers");
	}
	public MyDrivers(String name)
	{
		this(10);
		System.out.println("loading my drivers - Name is "+name);
	}
	public MyDrivers(int count)
	{
		System.out.println("loading my drivers - Count is "+count);
	}
	public void display()
	{
		System.out.println("i am in display method");
	}
	

	public static void main(String[] args) {
		
		MyDrivers obj1=new MyDrivers();
		obj1.display();
		
		
		

	}

}
