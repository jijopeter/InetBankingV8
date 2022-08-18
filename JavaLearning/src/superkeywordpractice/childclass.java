package superkeywordpractice;

public class childclass extends baseclass{
	int price=90;

	public static void main(String[] args) 
	{
		childclass obj1=new childclass();
		obj1.lulumallprice();

	}
	public void bigbazarprice()
	{
		System.out.println("the price of bigb child class "+price);
	}
	public void lulumallprice() 
	{
		bigbazarprice();
		super.bigbazarprice();
		System.out.println("price of lulu mall "+super.price);
	}

}
