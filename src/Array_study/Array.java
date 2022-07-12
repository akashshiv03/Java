package Array_study;

import java.util.Arrays;

public class Array
{
	public static void main(String[] args) {

	char grade[]=new char[7];
	//2.Initialization of array
	grade[0]='A';
	grade[1]='B';
	grade[2]='C';
	grade[3]='D';
	grade[4]='E';
	grade[5]='F';
	grade[6]='H';
	
	//3. usage
	//System.out.println(grade[0]);
	/*System.out.println(grade[1]);
	System.out.println(grade[2]);
	System.out.println(grade[3]);
	System.out.println(grade[4]);
	System.out.println(grade[5]);
	System.out.println(grade[6]);*/
	System.out.println("============================");
	
	/*for(int i=0;i<=6;i++)// static coding
	{
	System.out.println(grade[i]);
	}*/
	System.out.println("============================");
	for(int i=0;i<=grade.length;i++) //dynamic coding
	{
	System.out.println(grade[i]);
	}
	System.out.println("============================");
	/*for(int i=grade.length-1;i>=0;i--)
	{
	System.out.println(grade[i]);
/*	int A[]= {8,5,9,7,4};
	Arrays.sort(A);
	for(i=0;i<=A.length-1;i++)
	{
		System.out.println(A[i]);
	}*/
	/*	int A[]= {6,2,4,1,3,5};// 1+2 declaration +Initialization
		//3. usage
		for(int i=0;i<=A.length-1;i++)
		{
		System.out.println(A[i]);
		}
		System.out.println("=======================");
		// how to sort given array
		// we need to use sort method
		Arrays.sort(A);
		for(int i=0;i<=A.length-1;i++)
		{
		System.out.println(A[i]);
		}*/
		/*int A[]= {8,9,5,4,7,1,2};
		Arrays.sort(A);
		for(int i=0;i<=6;i++)
		{
			System.out.println(A[i]);
		}*/
	}

	
}
//}