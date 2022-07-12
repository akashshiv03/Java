package Variables_Study;

public class static_Globalvariable
{
	static int a=40;//golbal variable

	public static void main(String[] args)
	{
		System.out.println( "This is globalVariable the golbal variablr declare in out side of the method "+a);
	    static_Globalvariable SG=new static_Globalvariable();
	    SG.Display();
	    
	    LocalVariable_callfromDiff LV= new LocalVariable_callfromDiff();
	    LV.Display1();	
	    
	    System.out.println("gsflbnn"+LocalVariable_callfromDiff.c);
		

	}
	
	public void Display()
	{
		int b=30;
		System.out.println("This is Local variable the local variable declare in in side of the method "+b);
	}

}
