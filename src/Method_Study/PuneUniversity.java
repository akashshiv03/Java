package Method_Study;

public class PuneUniversity {

	public static void main(String[] args)
	{
	PuneUniversity pu = new PuneUniversity();// created object of the class
	pu.StudentInfo();// calling method without parameter
	
	pu.Student();
	
	pu.Student("Akash","xz8546","arts",3,'A');
	
	}
	public void StudentInfo()// non-static method-->without parameter
	{
	//Name; PRN; Course; Year; Grade
	String name="Velocity";
	String PRN="PU12345";
	String course="Engg";
	int year=3;
	char grade='A';
	System.out.println("=========================");
	System.out.println("Students name is "+name);
	System.out.println("Students PRN number is "+PRN);
	System.out.println("Students course is "+course);
	System.out.println("Students year is "+year);
	System.out.println("Students grade is "+grade);
	System.out.println("=========================");
	}
	public void Student()
	{
		
		String name1="Ramesh";
	    String Rollno="AB8596";
	    String Course1="Engg";
	    int year1=4;
	    char grade1='B';
	    
	    System.out.println("******************************");
	    System.out.println("Student name is "+name1);
	    System.out.println("Student PRN number is "+Rollno);
	    System.out.println("Student course is "+Course1);
	    System.out.println("Student year is "+year1);
		System.out.println("Students grade is "+grade1);

		}
	   public void Student(String name1,String Rollno,String Course1,int year1,char grade1)
	   {
		   System.out.println("******************************");
		    System.out.println("Student name is "+name1);
		    System.out.println("Student PRN number is "+Rollno);
		    System.out.println("Student course is "+Course1);
		    System.out.println("Student year is "+year1);
			System.out.println("Students grade is "+grade1);
		   
	   }
	}
	
    

	
	
