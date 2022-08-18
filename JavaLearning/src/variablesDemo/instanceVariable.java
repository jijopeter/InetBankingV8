package variablesDemo;

public class instanceVariable {
	int roll=10;
	double marks=80.5;
	
	
	

	public static void main(String[] args) 
	{
		instanceVariable obj1=new instanceVariable();
		obj1.show();
		instanceVariable obj2=new instanceVariable();
		obj2.show();
		instanceVariable obj3=new instanceVariable();
		obj3.show();
	}
	public void show()
	{
		System.out.println("Roll num "+roll + " "+"and marks are "+marks);
		
	}
	

}
