package Method_Study;

public class staticMethod
{
	

	public static void main(String[] args) 
	{
		System.out.println("this is main method");
		sample1();
		sample1();
		class1.sample2();
		
		staticMethod s1= new staticMethod();
		s1.sample3();
		
		class1 T1=new class1();
		//s4.Test();
		T1.Test1();
		
	}
	public static void sample1()
	{
		System.out.println("this is static method frome same class");
		
	}
	public void sample3()
	{
		System.out.println("this is non static method call from same class");
	}

}
