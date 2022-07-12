package logicalprograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Eenter value");
		String a=sc.next();
		String b="";
		
		for (int i=a.length()-1; i>=0; i--)
		{
			b=b+a.charAt(i);
		}
		System.out.println("Original Sring is "+a);
		System.out.println("Reverse String is "+b);
		if(a.equals(b))
		{
			System.out.println("This is palindrome");
		}
		else
		{
			System.out.println("This is not palindrome");
		}
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println("Reverse String is "+b);

		
		if(a.equalsIgnoreCase(a))
		{
			System.out.println("this is palindrome");
		}
		else
		{
			System.out.println("this is not palindrome");
		}

	}

}
