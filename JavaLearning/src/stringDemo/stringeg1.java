package stringDemo;

public class stringeg1 {

	public static void main(String[] args) {
		String name="jijo peter";
		boolean status=name.startsWith("jijo");
		System.out.println("status is "+status);
		
		String work="quality assurance";
		boolean status1=work.endsWith("assurance");
		System.out.println("work status is "+status1);
		
		String place="trivandrum";
		boolean status2=place.startsWith("tri");
		System.out.println("place status is "+status2);
		boolean status3=place.endsWith("drum");
		System.out.println("place status is "+status3);
		
		String work_place="bangalore";
		String actual_work_place="Bangalore";
		boolean status4=work_place.equalsIgnoreCase(actual_work_place);
		System.out.println("status is "+status4);
		
		String actuals="My home place is kerala";
		String expected="place";
		boolean status5=actuals.contains(expected);
		System.out.println("status is "+status5);
		
		String original_name="jijo peter";
		String alternate_name="peter";
		boolean status6=original_name.contains(alternate_name);
		System.out.println("both are same "+status6);
		
		String company_name="dunn-digital-solutions";
		String []toolname=company_name.split("-");
		for(int i=0;i<toolname.length;i++)
		{
			System.out.println("company name "+i+" is "+toolname[i]);
			
		}
		
		String company_offices="chicago-bangalore-singapore-england";
		String []officestool=company_offices.split("-");
		for(int i=0;i<officestool.length;i++)
		{
			System.out.println("branch name "+i+" is "+officestool[i]);
		}
		
		String class_rooms="1A-2A-3A";
		String []roomsplit=class_rooms.split("-");
		for(int i=0;i<roomsplit.length;i++)
		{
			System.out.println("clases "+i+" "+roomsplit[i]);
			if(roomsplit[i].equalsIgnoreCase("2A"))
			{
				System.out.println("Your class is 2A");
				break;
			}
		}
		String fullname="    jijo     peter    ";
		String name1=fullname.trim();
		System.out.println(name1);
		
		String fullname1="jijo peter";
		System.out.println(fullname1.charAt(5));
		System.out.println(fullname1.charAt(0));
		System.out.println(fullname1.charAt(9));

	}

}
