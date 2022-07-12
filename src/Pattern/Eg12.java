package Pattern;

public class Eg12 {

	public static void main(String[] args)
	{
		 //*
		 //**
		 //***
		 //****
		 //***
		 //**
		 //*
		//row=7 col=4 star=1 space=3
		int star=1; int space=3;
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<4)
			{
				star++;
			}
			else
			{
				star--;
			}
		}

	}

}
