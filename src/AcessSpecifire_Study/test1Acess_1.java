package AcessSpecifire_Study;

public class test1Acess_1 
{
    int a=50;
    private int b=60;
    public int c=70;
    protected int d=20;
    int x=10;
    int z;
    
	public static void main(String[] args)
	{
		test1Acess_1 T1=new test1Acess_1();
		{
			T1.test();
			T1.test1();
			T1.test2();
			protected1 P=new protected1();
			P.test2();
			
		}
	}
	void test()//default AcessSpecifire
	{
		z=a+x;
		System.out.println(z);
		
	}
	private void test1()//private AcessSpecifire
	{
		z=a+b;
		System.out.println(z);
	}
	public void test2()//public AcessSpecifire
	{
		z=a+c;
		System.out.println(z);
	}
	

}
