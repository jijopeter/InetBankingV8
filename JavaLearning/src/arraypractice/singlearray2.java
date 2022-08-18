package arraypractice;

public class singlearray2 {

	public static void main(String[] args) {
		int marks[]=new int[4];
		marks[0]=20;
		marks[1]=25;
		marks[2]=15;
		marks[3]=18;
		System.out.println("student marks "+marks[1]);
		
		int sizeofarray=marks.length;
		System.out.println("length of array is "+sizeofarray);
		for(int i=0;i<sizeofarray;i++)
		{
			System.out.println("student marks is "+marks[i]);
		}
		

	}

}
