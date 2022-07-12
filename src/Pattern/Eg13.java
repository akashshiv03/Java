package Pattern;

public class Eg13 {

	public static void main(String[] args)
	{
		 //*         *
		 //**       **
		 //***     ***
		 //****   ****
		 //***** *****
		 //****   ****
		 //***     ***
		 //**       **
		 //*         *
		//row=7 col=9 star=2 space=
		 int star1 = 1; // Star on the first Row Left
		 int space1 = 5; // Space on the first Row Left
		 int star2 = 1; // Star on the first Row Right
		 int space2 = 4; // Space on the first Row Right
 
		for(int i=1; i<=9; i++)
		{
			for(int j=1;j<=star1;j++)
			{
				System.out.print("*");
			}
			for(int m=1;m<=space1;m++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=space2;k++)
			{
				System.out.print(" ");
			}
			for(int h=1;h<=star2;h++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<5)
			{
			 star1++;
			 space1--;
			 star2++;
			 space2--;
			}
			else
			{
				star1--;
				space1++;
				star2--;
				space2++;
			}
			
		}
		

	}

}
