package conditionalpractice;

public class ifelseif1 {

	public static void main(String[] args) {
		String student_name="Prayan";
		if(student_name.equalsIgnoreCase("sathwik"))
		{
			System.out.println("he is in 1D");
		}
		else if(student_name.equalsIgnoreCase("srawan"))
		{
			System.out.println("he is in 1A");
		}
		else if(student_name.equalsIgnoreCase("prayan"))
		{
			System.out.println("he is in 1B");
		}
		else
		{
			System.out.println("he is in 1C");
		}
	}

}
