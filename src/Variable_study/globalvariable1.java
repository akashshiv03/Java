package Variable_study;

public class globalvariable1
{
	int a=50;//non static method call from same class
	static int b=60;//static method

	public static void main(String[] args) 
	{
	 globalvariable1 gvc=new globalvariable1();	
	 gvc.Display();
      System.out.println("this is non static global variable"+gvc.a);
      //System.out.println("this is non static local variable"+gvc.d);
      
      Test123 T1=new Test123();
      T1.Display4();
      T1.Display3();
      
      Test123.Display3();
      
      System.out.println("this is global variable call from diff/another class"+Test123.x);
	}
	public void Display()
	{
		int b=6,c=10,d;//local variable call from same class
		d=b+c;
		System.out.println(d);
		
		
	}

}
