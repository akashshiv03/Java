package Pattern;

public class Eg2 {

	public static void main(String[] args)
	{
		//+
		//+ +
		//+ + +
		//+ + + +
		//+ + + + +
		//row=5 col=5 plus=1 space=4
		
		int pluse=1; 
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=pluse; j++)
			{
			   System.out.print("+ ");	
			}
			System.out.println();
			pluse++;
			
		}

	}

}
