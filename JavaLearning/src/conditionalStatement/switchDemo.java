package conditionalStatement;

public class switchDemo {

	public static void main(String[] args) 
	{
		int x=5;
		switch(x)
		{
			case 1:
				System.out.println("Performance is poor");
			break;
			
			case 2:
				System.out.println("slow performer");
			break;
			case 3:
				System.out.println("meeting expectations");
			break;
			case 4:
				System.out.println("well done keep rocking");
			break;
			case 5:
				System.out.println("employ of the year");
			break;
			default:
				System.out.println("you are fired");
		}
		

	}

}
