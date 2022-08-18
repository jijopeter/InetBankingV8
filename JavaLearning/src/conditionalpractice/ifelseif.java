package conditionalpractice;

public class ifelseif {

	public static void main(String[] args) {
		String employe="jijo peter";
		if(employe.equalsIgnoreCase("jij"))
		{
			System.out.println("not our employ");
		}
		else if(employe.equalsIgnoreCase("ji"))
		{
			System.out.println("not our department");
		}
		else if(employe.equalsIgnoreCase("ryan"))
		{
			System.out.println("not from sister company");
		}
		else
		{
			System.out.println("he is our employee "+employe);
		}
			

	}

}
