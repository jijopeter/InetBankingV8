package stringDemo;

public class StringDemo2 {

	public static void main(String[] args) {
		String actuals="welcome to Selenium webdriver world";
	    String expected="Welcome to Selenium webdriver world1";
		boolean status2=actuals.equalsIgnoreCase(expected);
		System.out.println("status is "+status2);
	}

}
 