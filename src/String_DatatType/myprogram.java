package String_DatatType;

import Method_Study.Main_mathod_program;

public class myprogram
{

	//public static void main(java.lang.String[] args)
	public static void main(String[] args) 
		
	
	{
		//int a=85845;
		//String myText="Hello";
		// String myText1 = "Hello";
		 
		// System.out.println("myText1"+myText);
		 
		 String Myname="Akash";
		 System.out.println("my name is "+Myname);
		 char ab;
		 String nstr = "";//
		 
		 for(int i=0; i<=Myname.length()-1; i++ )
		 {
			 ab= Myname.charAt(i);
			 nstr=ab+nstr;//for reverse order we need to use NSTR function adds each character in front of the existing string
		 }
		 System.out.println(nstr);	 

	}

	}

