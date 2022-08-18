package InterfaceDemo;

public class AdvanceCal2 implements Calc {

	public static void main(String[] args) 
	{
		//you cannot create object of an interface
		//Calc obj1=new Calc();
		//AdvanceCal1 obj2=new Calc();
		//you cannot create object of an interface because it has abstract method
		
		
	}
	public void calculateSin()
	{
		System.out.println("i am in Advance Calc- Sin method");
	}
	public void calculateCos()
	{
		System.out.println("i am in Advance Calc- Cos method");	
	}
	

	public void add() {
		
		System.out.println("i am in add method");
	}


	public void sub() {
		
		System.out.println("i am in sub method");
		
	}

}
