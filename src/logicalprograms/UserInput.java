package logicalprograms;

import java.util.Scanner;

public class UserInput {
	
	int c;

	public static void main(String[] args)
	{
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter value of a");
       int a=sc.nextInt();
       
       System.out.println("Enter value of b");
       int b=sc.nextInt();
       
       System.out.println("A value is "+a);
       System.out.println("B value is "+b);
       
       int c=a+b;
       
       System.out.println("addition a and b is "+c);
       
       
	}

}
