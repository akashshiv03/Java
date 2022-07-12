package Array_study;

public class Array_2D
{

	 public static void main(String[] args)
	    {
	  
	        int[][] arr = { { 1, 2,5 }, { 3, 4,5 }, };
	        
	  
	        for (int i = 0; i <=2; i++)//i=0=1,i=1,i=2,i=0 i=1 i=2 i=0
	        {
	            for (int j=0; j <=2; j++)//j=0=1 j=0 j=0.j=1 j2 
	            {
	                System.out.print(arr[i][j]+ " ");
	            }
	           // for(int a=0; a<arr.length; a++)
	            //{
	            	//System.out.println(arr[i][j][a]+" ");
	            //}
	  
	            System.out.println();
	        }
	        
 }
}