package InterfaceDemo;

public class AdvanceCal implements Calc {

	public static void main(String[] args) 
	{
		AdvanceCal obj1=new AdvanceCal();
		obj1.add();
		obj1.sub();
		obj1.calculateSin();
		obj1.calculateCos();
		
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
