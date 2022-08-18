package stringDemo;

public class StringDemo3 {

	public static void main(String[] args) {
		String actuals="welcome to Selenium webdriver world";
	    String expected="Selenium";
		boolean status2=actuals.contains(expected);
		System.out.println("status is "+status2);
	}

}
  