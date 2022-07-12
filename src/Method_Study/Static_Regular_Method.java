// Regular method
//	static regular method
//	non static regular method
//public static void main();  // method declaration// incomplete method
//public static void main()   // method definition// complete method


package Method_Study;

public class Static_Regular_Method {

	public static void main(String[] args)
	{
		
     demo();//  static method call from same class 
 	       // to call static method from same class --> directly call static method ie. methodname();
     sample S=new sample();
     S.m();
     S.m0();


	}
    public static void demo()//this is static method and complete method
    {
    	System.out.println("this is complete method");
    }
}
