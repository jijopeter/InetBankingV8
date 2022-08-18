package finalvarDemo;

public class FinalVariDemo {

	public static void main(String[] args) {
		
		FinalVariDemo obj1=new FinalVariDemo();
		obj1.show();
		

	}
	
	public void show()
	{
		int marks=90;
		marks=95;
		
		final int FINAL_MARKS=80;
		
		System.out.println(FINAL_MARKS);
	}

}
