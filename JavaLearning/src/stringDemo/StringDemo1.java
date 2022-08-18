package stringDemo;

public class StringDemo1 {

	public static void main(String[] args) {
		String name="Selenium webdriver";
		boolean status=name.startsWith("Selenium");
		System.out.println("Status is "+status);
		String name1="welcome to selenium webdriver world";
		boolean status2=name1.endsWith("world");
		System.out.println("new status is "+status2);
	}

}
