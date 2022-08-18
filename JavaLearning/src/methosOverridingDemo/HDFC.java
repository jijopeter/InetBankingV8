package methosOverridingDemo;

public class HDFC extends RBI{

	public static void main(String[] args) {
		RBI r=new RBI();
		r.homeloanIntRate();
	}
	public void homeloanIntRate()
	{
		System.out.println("Home loan int rate is 11%");
	}

}
