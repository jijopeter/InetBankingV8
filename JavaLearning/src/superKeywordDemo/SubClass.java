package superKeywordDemo;

public class SubClass extends ParentClass
{
	public SubClass()
	{
		System.out.println("i am in child class cons ");
	}
	public SubClass(String name)
	{
		super(name);
		System.out.println("i am in child class cons "+name);
	}
	public static void main(String []args)
	{
		SubClass obj1=new SubClass("mukesh");
	}

}
