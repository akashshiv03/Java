package logicalprograms;

public class EvenOddNumber {

	public static void main(String[] args)
	{
		int a[]= {10,50,12,9,7,2,4,6,8,1,};
		
	
		  for(int i=0; i<a.length; i++)
	        {
	        	if(a[i]%2==0)
	        	{
	        			        	
	             	System.out.println("This is even number "+a[i]);
	        	}
        		//System.out.println("This is odd number "+a[i]);
                
	        	else if(a[i]%2!=0)
	        	{
	        		System.out.println("This is odd number "+a[i]);
	        	}
	}

}
}
