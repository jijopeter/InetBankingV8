package abstractpractice;

public abstract class schooloffice implements student
{

	@Override
	public void books() {
	System.out.println("books supplied");	
		
	}

	@Override
	public void uniforms() {
		System.out.println("uniforms supplied");
		
	}

	@Override
	public abstract void fees();
	
	
	

}
