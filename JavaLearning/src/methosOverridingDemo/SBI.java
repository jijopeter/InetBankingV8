package methosOverridingDemo;

public class SBI extends RBI implements loan{
	
	public static void main(String []args)
	{
		SBI home=new SBI();
		home.homeloanIntRate();
	}
	public void homeloanIntRate()
	{
		System.out.println("Home loan int rate is 9%");
	}
	
	public void homeloan() {
		
		System.out.println("SBI providing home loan");
	}
	
	public void carloan() {
		System.out.println("SBI providing car loan");
		
		
	}

}
