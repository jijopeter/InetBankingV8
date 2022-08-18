package finalvarDemo;

public class FinalVariDemo2 {
	
	final String PANCARD;
	
	public FinalVariDemo2(String pancard)
	{
		PANCARD=pancard;
	}

	public static void main(String[] args) {
		
		FinalVariDemo2 obj1=new FinalVariDemo2("AAZ");

	}
	
	public void show()
	{
		System.out.println("PAN CARD details are "+PANCARD);
	}

}
