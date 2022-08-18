package conditionalStatement;

public class ifelseifDemo {

	public static void main(String[] args) {
		
		System.out.println("Test started");
		String browser="IE";
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.out.println("TC executed on Chrome ");
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.out.println("TC executed on Firefox");
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.out.println("TC executed on IE");
		}
		
			else
			{
		System.out.println("Kindly provide valid browser names");
			}
		
		 
	}

}
