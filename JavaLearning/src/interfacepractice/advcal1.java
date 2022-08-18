package interfacepractice;

public class advcal1 implements cal1{

	public static void main(String[] args) {
		advcal1 obj1=new advcal1();
		obj1.marks();
		obj1.count();
		obj1.advcount();
		obj1.advmarks();

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
