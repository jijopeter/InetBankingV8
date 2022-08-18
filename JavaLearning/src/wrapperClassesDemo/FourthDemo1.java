package wrapperClassesDemo;

public class FourthDemo1 {

	public static void main(String[] args) {
		
		//auto boxing
		int a=100;
		Integer b=a;
		System.out.println("autoboxing"+b);
		
		//boxing
		
		int x=90;
		Integer y=Integer.valueOf(x);
		System.out.println("boxing"+y);
		//unboxing
		Integer result=100;
		int newResult=result.intValue();
		System.out.println("Unboxing"+newResult);
		
		//auto unboxing
		Integer marks=78;
		int newMarks=marks;
		System.out.println("Autounboxing"+newMarks);
		
	}

}
