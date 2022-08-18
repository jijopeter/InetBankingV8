package methodoverridingpractice;

public class childsalary extends parentsalary implements govtsalary{

	public static void main(String[] args) 
	{
		childsalary company=new childsalary();
		company.salary();
		parentsalary company1=new parentsalary();
		company1.salary();
		parentsalary company2=new childsalary();
		company2.salary();
		

	}
	public void salary()
	{
		System.out.println("IBS child salary is 21000");
	}
	@Override
	public void clerksalary() 
	{
		System.out.println("clerk salary is 15000");	
	}
	@Override
	public void secretarysalary() 
	{
		System.out.println("secretary salary is 40000");
		
	}

}
