package methodoverridingpractice;

public class childsalary1 extends parentsalary implements govtsalary{

	public static void main(String[] args) 
	{
		childsalary1 company=new childsalary1();
		company.salary();
		parentsalary company1=new parentsalary();
		company1.salary();
		parentsalary company2=new childsalary1();
		company2.salary();
		//interface
		govtsalary company3=new childsalary1();
		company3.clerksalary();
		childsalary1 company4=new childsalary1();
		company4.secretarysalary();
		

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
