package abstractJavatutorials;

public class HRTeam extends ITDepart{
	
	public static void main(String []args)
	{
		//1st scenario
		HRTeam hr=new HRTeam();
		hr.goodies();
		hr.work();
		hr.salary();
		hr.bonus();
		
		ITDepart  it=new HRTeam();
		it.goodies();
		it.work();
		it.salary();
		
		//ITDepart it1=new ITDepart();
		//If you class is not fully implemented then we will not allow you to create object
		//Interface we dont have single method implemented
		// interface is 100% abstract class
		
	}
	public void bonus()
	{
		System.out.println("Bonus is 1 lakh");
	}

	
	public void salary() {
		System.out.println("SLPA");
	}

}
