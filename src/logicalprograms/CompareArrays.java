package logicalprograms;

import java.util.Arrays;

public class CompareArrays {

	public static void main(String[] args) 
	{
		int ar1[]= {10,20,30};
		int ar2[]= {50,60,70};
		int ar3[]= {10,20,30};
		
		System.out.println(Arrays.equals(ar1,ar2));
		System.out.println(Arrays.equals(ar1, ar3));

	}

}
