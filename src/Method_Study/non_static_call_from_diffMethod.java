package Method_Study;

public class non_static_call_from_diffMethod {

	public static void main(String[] args)
	{
		sample1 S1=new sample1();
		S1.m1();
		S1.m2();
		
		sample2 S2=new sample2();
		S2.m3();
		S2.m4();

	}

}
