package Pattern;

public class Eg14 {

	public static void main(String[] args)
	{   
		//     *
		//    * *
		 //  * * *
		 // * * * *
		 //* * * * * 
	     //* * * * *
		 // * * * *
		 //  * * *
		 //   * *
		 //    *
		//
		int star1=1; int space1=5;
		int star2=4; int space2=1;
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=space1;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star1++; 
			space1--;
		}
		for(int n=1;n<=4;n++)
		{
			for(int k=1;k<=space2;k++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star2;k++)
			{
				System.out.print(" *");
			}
				
			System.out.println(" ");
				star2--;
				space2++;
		}	
			
		}
	

		

}
