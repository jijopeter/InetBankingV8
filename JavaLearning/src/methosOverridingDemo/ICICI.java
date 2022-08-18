package methosOverridingDemo;

public class ICICI extends RBI{
	
	public static void main(String []args)
	{
		ICICI home=new ICICI();
		home.homeloanIntRate();
	}
	public void homeloanIntRate()
	{
		System.out.println("Home loan int rate is 10%");
	}

}
