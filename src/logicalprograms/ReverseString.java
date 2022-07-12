package logicalprograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args)
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter String");
      String a=sc.next();
      String b="";
      
      for (int i=a.length()-1; i>=0; i--)
      {
    	  b=b+a.charAt(i);
    	 // System.out.println(b+""+b);
      }
      System.out.println(a);
      System.out.println(b);
      
      String s=sc.next();
      String d="";
      
      for(int i=s.length()-1;i>=0;i--)
      {
    	  d=d+s.charAt(i);
      }
      System.out.println(s);
      System.out.println(d);
      System.out.println();
      
	}

}
