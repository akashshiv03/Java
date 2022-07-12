package Constructor_Study;

public class userdcon 
{
	int a,b,c;
	public userdcon()//without parameter
	{
		a=10;
		b=20;
		c=30;
	}
	public userdcon(int x)//
	{
		 a=x;
	}
	public userdcon(int x,int y)
	{
		 a=x;
		 b=y;
	}
	public userdcon(int x,int y,int z)
	{
		 a=x;
		 b=y;
		 c=z;
	}
	

	public static void main(String[] args)
	{
	userdcon u=new userdcon();
	u.Addition();
	
	userdcon u1=new userdcon(50);
	u1.Addition();
	
	userdcon u2=new userdcon(60,50);
	u2.Addition();
	
	userdcon u3=new userdcon(70,80,90);
	u3.Addition();
	
	user1 U=new user1();
	U.Display5();

	}
	public void Addition()
	{
	 int Add=a+b+c;
	 System.out.println("Add of A,B,C "+Add);
	 
	}

}
