package interfacepractice;

public class advcal3 implements cal1{

	public static void main(String[] args) {
		//you cannot create object of an interface
		//cal1 obj1=new cal1();
		//you cannot create object of an interface because it has abstract method.
		//advcal3 obj1=new cal1();
		
		

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
