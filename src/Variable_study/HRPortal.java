package Variable_study;

public class HRPortal
{

	public static void main(String[] args)
	{
		Employee SachinT= new Employee();// object created
		SachinT.emp_name="Sachin Tendulkar";
		SachinT.emp_dept="Batting";
		SachinT.emp_id=10;
		SachinT.emp_grade='A';
		SachinT.emp_sal=123.123f;
		
		Employee ViratK= new Employee();
		ViratK.emp_name="Virat Kohali";
		ViratK.emp_dept="Batting";
		ViratK.emp_id=18;
		ViratK.emp_sal=45678.12f;
		ViratK.emp_grade='A';
		SachinT.emp_info();
		ViratK.emp_info();
	}
}