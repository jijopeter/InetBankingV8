package variablesDemo;

public class instancevariableeg2 {
	
	int marks;
	double code;
	
	
	public instancevariableeg2(int marks,double code)
	{
		this.marks=marks;
		this.code=code;
	}
	

	public static void main(String[] args) 
	{
		instancevariableeg2 obj1=new instancevariableeg2(33,66.66);
		obj1.print();
		instancevariableeg2 obj2=new instancevariableeg2(40,66.75);
		obj2.print();
		instancevariableeg2 obj3=new instancevariableeg2(33,66.85);
		obj3.print();
	}
	public void print()
	{
		int x=0;
		System.out.println("my marks are "+marks +" "+ "and my code is "+code);
		System.out.println(x);
	}

}
