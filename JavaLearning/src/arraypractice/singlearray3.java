package arraypractice;

public class singlearray3 {

	public static void main(String[] args) {
		int count[]=new int[5];
		count[0]=(int)10.50;
		count[1]=11;
		count[2]=12;
		count[3]=13;
		count[4]=14;
		System.out.println("count from "+count[3]);
		
		int totalcount=count.length;
		System.out.println("length of count "+totalcount);
		
		for(int i=0;i<totalcount;i++)
		{
			System.out.println("count from "+count[i]);
		}
		int i=4;
		while(i<totalcount)
		{
			System.out.println("count is valid "+count[i]);
			i++;
		}
		int a=5;
		if(a<totalcount)
		{
			System.out.println("count is valid "+count[i]);
		}
		else
		{
			System.out.println("count is invalid ");
		}
		String count_name[]=new String[4];
		count_name[0]="one";
		count_name[1]="two";
		count_name[2]="three";
		count_name[3]="four";
		int totalcount1=count_name.length;
		System.out.println("length of name "+totalcount1);
		for(int x=0;x<totalcount1;x++)
		{
			System.out.println("count name from "+count_name[x]);
		}
		
	}

}
