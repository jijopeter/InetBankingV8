package abstractpractice;

public class schoolHR extends schooloffice
{
	public static void main(String[]args)
	{
		schoolHR hr=new schoolHR();
		hr.books();
		hr.uniforms();
		hr.fees();
		hr.otherfees();
		
		schooloffice office=new schoolHR();
		office.books();
		office.uniforms();
		office.fees();
		
		
	}
	public void otherfees()
	{
		System.out.println("other fees is 2000");
	}

	@Override
	public void fees() {
		System.out.println("quarterly fees is 5000");
		
	}

}
