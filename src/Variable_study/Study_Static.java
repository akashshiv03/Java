package Variable_study;

public class Study_Static {

		 static int a=50;// static global variable

			public static void main(String[] args) {
				
				Study_Static s= new Study_Static();
				s.display();
				System.out.println("value of a is "+a);// calling static global variable from same class
				System.out.println("value of p is "+Study_Static1.p);//calling static global variable from another class
				
				//System.out.println("non static call from diff class global variable "+Study_Static1.Display);
				 Study_Static1 D= new Study_Static1();
				 D.Display();

			}
			
			public void display()//non static global variable from same class
			{
				int b= 60;
				
				System.out.println("value of b is "+b); //  local variable
				System.out.println("value of a is "+a); //  static global variable
				
			}

		}
