package Pattern;

public class Eg4 {

	public static void main(String[] args) 
	{
		//       +
		//      ++ 
		//     +++ 
		//    ++++ 
		//   +++++
		//row=5 col=5 pluse=1 space=4
		int pluse=1; int space=4;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=space; j++)//
			{
				System.out.print(" ");
			}
			for(int j=1;j<=pluse;j++)
			{
			System.out.print("+");
			}

			System.out.println();
			space--;
			pluse++;
		}
		

	}

}
