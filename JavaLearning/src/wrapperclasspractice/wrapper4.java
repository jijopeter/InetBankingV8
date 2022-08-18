package wrapperclasspractice;

public class wrapper4 {

	public static void main(String[] args) {
		int a=20;//autoboxing
		Integer b=a;
		System.out.println(b);
		
		int x=30;//boxing
		Integer y=Integer.valueOf(x);
		System.out.println(y);
		
		Integer c=30;//unboxing
		int e=c.intValue();
		System.out.println(e);
		
		Integer rollno=10;//auto unboxing
		int newrollno=rollno;
		System.out.println(newrollno);
		
		int count=40;//boxing
		Integer newcount=Integer.valueOf(count);
		System.out.println(newcount);
		
		Integer count1=50;//unboxing
		int newcount1=count1.intValue();
		System.out.println(newcount1);
		
		int no=10;//autoboxing
		Integer no1=no;
		System.out.println(no1);
		
		Integer a1=15;//autounboxing
		int a2=a1;
		System.out.println(a2);
		
		int b1=11;
		Integer b2=Integer.valueOf(b1);
		System.out.println(b2);
		
		Integer c1=21;
		int c2=c1.intValue();
		System.out.println(c2);
	}

}
