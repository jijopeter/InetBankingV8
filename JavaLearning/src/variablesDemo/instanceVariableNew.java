package variablesDemo;

public class instanceVariableNew {
	int roll;
	double marks;
	int x=100;
	
	public instanceVariableNew(int roll,double marks)
	{
		this.roll=roll;
		this.marks=marks;
	}
	

	public static void main(String[] args) 
	{
		instanceVariableNew obj1=new instanceVariableNew(1,80.5);
		obj1.show();
		instanceVariableNew obj2=new instanceVariableNew(2,90.5);
		obj2.show();
		instanceVariableNew obj3=new instanceVariableNew(3,95.5);
		obj3.show();
	}
	public void show()
	{
		int x=0;
		System.out.println(x);
		System.out.println("Roll num "+roll + " "+"and marks are "+marks);
		
	}
	

}
