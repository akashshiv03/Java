package Variable_study;

public class GlobalAndLocalVarialbe
{
  int a=100;//global non-static variable
  static int b=100;//global static variable
  
  public static void main(String[] args) 
  {
	int a=10;
	GlobalAndLocalVarialbe gac= new GlobalAndLocalVarialbe();// createc object of a class
	
		System.out.println("Value of a is "+gac.a);// calling non-static global variable form same class
		
		System.out.println("value of b is "+b);//calling static global variable from same class
		
		System.out.println("value of static globa variable from another class "+Test.y);//calling static global variable from another class
		
		Test t = new Test();// created object of another class
		
		System.out.println("value of non-static global variable form another class is "+t.x);//calling non-static global variable from another class
		
		int mul=b*gac.a;
		
		int div=b/(Test.y);
		
		int addition=gac.a+t.x;
	}
		public void addition()
		{
		 int p=10;
		 int sum=p+10;// p is local variable known to addition method only
		 int sum1=a+100;// a is global variable known to whole class
		}
		public void sub()
		{
		 int q=20;
		 //int sub1=p-q;// p is local variable of another method
		 int sub=a-q;//a is global variable known to whole class
		}
}