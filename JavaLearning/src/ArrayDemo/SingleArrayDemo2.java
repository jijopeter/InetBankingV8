package ArrayDemo;

public class SingleArrayDemo2 {

	public static void main(String[] args) {
		int student_id[]=new int[5];
		student_id[0]=(int) 89.0;
		student_id[1]=45;
		student_id[2]=12;
		student_id[3]=890;
		student_id[4]=980;
		int sizeofarray=student_id.length;
		System.out.println("length of arrays is "+sizeofarray);
		for(int i=0;i<sizeofarray;i++) 
		{
			System.out.println("students id is "+student_id[i]);
		}
		String student_name[]=new String[5];
		student_name[0]="mukesh";
		
		
		

	}

}
