package logicalprograms;

public class MultiPlicationWithoutOperator {

	public static void main(String[] args)
	{
       //10*4
	   //10+10+10+10
		int a=10; int z=20;
		int b=4;
		int c=0;
		int c1=0;
		//for(int i=1;i<=4;i++)//1->2

		for(int i=1; i<=4; i++)
		{
			c=c+a;
		}
		System.out.println(c);
		for(int i=1; i<=5; i++)
		{
			c1=c1+z;
		}
		System.out.println(c1);
		
	}

}
