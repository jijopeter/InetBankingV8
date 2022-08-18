package stringDemo;

public class StringDemo4 {

	public static void main(String[] args) {
		String fullname= "Selenium-HP-QTP-Grid";
		String []toolname=fullname.split("-");
		for(int i=0;i<toolname.length;i++)
		{
			System.out.println("value for"+i+" is "+toolname[i]);
			if(toolname[i].equalsIgnoreCase("Selenium"))
			{
				System.out.println("test passed");
				
			}
		}
	}

}
  