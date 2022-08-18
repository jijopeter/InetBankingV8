package thiskeywordDemo;

public class Myvariables {
	
	int x;
	int y;
	
	public Myvariables(int a,int b)
	{
		x=a;
		y=b;
	}
	public void sum()
	{
		int sum=x+y;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Myvariables obj1=new Myvariables(10,50);
		obj1.sum();		
		
		
		

	}

}
