package Variable_study;

public class Study_Static1
{
	 static int p= 50; //static global variable from stdy_static1 class
	 
	 public void Display()
	 {
		 int a=18,b=10,c;
		 c=a+b;
		 System.out.println("non static call from diff class global variable "+c);
		 
	 }

}
