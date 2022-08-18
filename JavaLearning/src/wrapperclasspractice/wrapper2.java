package wrapperclasspractice;

public class wrapper2 {

	public static void main(String[] args) {
		String a="150";
		String b="50";
		//int result=a+b;
		//System.out.println(result);
		int c=Integer.parseInt(a);
		int e=Integer.parseInt(b);
		int add=c+e;
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
