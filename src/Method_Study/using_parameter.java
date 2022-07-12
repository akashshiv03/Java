package Method_Study;

public class using_parameter {

	public static void main(String[] args)
	{
	PuneUniversity pu = new PuneUniversity();// created object of the class
	pu.StudentInfo();// calling method without parameter
	pu.StudentInfo("Mahesh", "PU989898", "Bsc", 3, 'A');// calling method with
	parameter
	pu.StudentInfo("Mahesh1","PU989797", "Bcom", 2, 'B');
	pu.StudentInfo("Vishnu", "PU878787", "MBA", 1, 'A');
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
	public void StudentInfo(String name,String PRN, String course,int year, char grade
	)//method with parameter
	{
	System.out.println("=========================");
	System.out.println("Students name is "+name);
	System.out.println("Students PRN number is "+PRN);
	System.out.println("Students course is "+course);
	System.out.println("Students year is "+year);
	System.out.println("Students grade is "+grade);
	System.out.println("=========================");
	}
	}
