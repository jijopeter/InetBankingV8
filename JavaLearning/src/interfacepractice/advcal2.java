package interfacepractice;

public class advcal2 implements cal1{

	public static void main(String[] args) {
		cal1 obj1=new advcal2();
		obj1.marks();
		obj1.count();
		

	}
	public void advmarks()
	{
		System.out.println("my adv marks is 10");
	}
	public void advcount()
	{
		System.out.println("my adv count is 20");
	}
	@Override
	public void marks() {
		System.out.println("my marks is 15");
		
	}
	@Override
	public void count() {
		System.out.println("my count is 25");
		
	}

}
