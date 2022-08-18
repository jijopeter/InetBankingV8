package constructorpractice;

public class marks1 {
	int result;

	public static void main(String[] args) 
	{
		marks1 obj2=new marks1(50);
		obj2.displayresult();

	}
	public marks1(int mark)
	{
		result=mark;
	}
	
	public void displayresult()
	{
		System.out.println("my final result is "+result);
	}

}
