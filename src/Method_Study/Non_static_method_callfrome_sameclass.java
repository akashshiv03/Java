package Method_Study;

public class Non_static_method_callfrome_sameclass
{
	public void demo2()
	{
		System.out.println("non static method call from same class");
		int a=5,b=6,c;
		c=a+b;
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println();
		
		Non_static_method_callfrome_sameclass d1=new Non_static_method_callfrome_sameclass();//
		d1.demo2();//object name.class name
		

	}

}
