package Pattern;

public class Eg3 {

	public static void main(String[] args)
	{
		// +++++
		// ++++
		// +++
		// ++
		// +
   		//row=5 col=5 pluse=5 space=0
		int pluse=5; int space=0;
		for(int i=1; i<=5; i++ )
		{
			for(int j=1; j<=pluse; j++ )
			{
				System.out.print("+ ");
			}
			System.out.println();
			pluse--;
		}

	}

}
