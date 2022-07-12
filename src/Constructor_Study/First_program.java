package Constructor_Study;

public class First_program 
{
		// example of default constructor
	//public CS1() --->// default constructor provided by compiler
	//{
		
//	}

		public static void main(String[] args) {
			
			First_program FP= new First_program();
			FP.display();

		}
		
		public void display()
		{
			
			System.out.println("I am display method i am non static");
		}

	}
