package classobjectmethod;

public class secondclass {

	public static void main(String[] args) {
		calculator1 cal1=new calculator1();
		cal1.delete();
		cal1.insert();
		System.out.println("print the employe name "+cal1.name);
		System.out.println("print the job details "+cal1.job);
	}

}
