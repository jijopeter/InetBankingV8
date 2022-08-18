package wrapperclasspractice;

public class wrapper3 {

	public static void main(String[] args) {
		String a="149.95";
		String b="50.05";
		//int result=a+b;
		//System.out.println(result);
		double c=Double.parseDouble(a);
		double e=Double.parseDouble(b);
		System.out.println(c);
		System.out.println(e);
		double add=c+e;
		System.out.println("addition is "+add);
		if(add==200)
		{
			System.out.println("print the value "+add);
		}
		else
		{
			System.out.println("print negative value");
		}

	}

}
