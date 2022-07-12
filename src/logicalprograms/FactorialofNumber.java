package logicalprograms;

public class FactorialofNumber {

	public static void main(String[] args) {
		// 4!-->4*3*2*1=24
		int a=6;
		int b=1;
		int c=7;
		int d=1;
		
		for(int i=a;i>=1;i--)//6,5,4,3,2,1
		{
		  b=b*i;//6*1=6; 6*5=30; 4*30=120; 3*120=360; 2*360=720;
		}
		  System.out.println("Factorial of number is "+b);
		  
		  for(int i=c; i>=1; i--)
		  {
			  d=d*i;
		  }
		  System.out.println("factorial of number is "+d);
		}
	}
