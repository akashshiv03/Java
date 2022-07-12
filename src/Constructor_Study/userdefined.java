package Constructor_Study;

public class userdefined 
{
	int a;
	  int b;
	  int c;
	public userdefined()// user defined without parameter constructor
	{
	  a=10;
	  b=20;
	  c=30;
	}
	public userdefined(int x)// user defined  one parameter constructor
	{
	  a=x;
	}
	public userdefined(int x, int y)//// user defined with two parameter constructor
	{
	  a=x;
	  b=y;
	}
	public userdefined(int x, int y, int z)//
	{
	  a=x;
	  b=y;
	  c=z;
	}
	public static void main(String[] args) 
	{
	   userdefined u= new
	   userdefined();
	   
	   u.multiplication();// calling method with zero parameter constructor
	   userdefined u1= new userdefined(1000);
	   
	   u1.multiplication();
	   userdefined u2= new
	   userdefined(80, 90);
	   
	   u2.multiplication();
	   userdefined u3= new
	   userdefined(20, 30, 40);
	   u3.multiplication();
	}
	public void multiplication()// method without parameter
	{
	  int mul=a*b*c;
	  System.out.println("multiplication is "+mul);
	}
	}

