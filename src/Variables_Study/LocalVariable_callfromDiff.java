package Variables_Study;

public class LocalVariable_callfromDiff
{
    static int c=50;//static method
	
	public void Display1()//non static method
	{
		int p=80;
		System.out.println("this is local variable call from diff class "+p);
	}

}
