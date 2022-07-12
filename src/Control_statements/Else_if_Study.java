package Control_statements;

public class Else_if_Study {

	public static void main(String[] args) {
		//if marks >=60--->You are in dist
		//elseif marks>=50-->1st class
		//elseif marks>=40-->pass
		//else you are fail
		int marks=30;
		if(marks>=60)
		{
		  System.out.println("You are in dist");
		}
		else if (marks>=50)
		{
		  System.out.println("You are in 1st class");
		}
		else if (marks>=40) 
		{
		  System.out.println("You are pass");
		}
		else if (marks<40) 
		{
		  System.out.println("You are fail");
		}
		// else
		// {
		// System.out.println("You are fail");
		// }
		}
	}
