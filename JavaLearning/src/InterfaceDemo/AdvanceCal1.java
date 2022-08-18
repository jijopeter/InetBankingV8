package InterfaceDemo;

public class AdvanceCal1 implements Calc {

	public static void main(String[] args) 
	{
		Calc obj1=new AdvanceCal1();
		obj1.add();
		obj1.sub();
		
		
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
