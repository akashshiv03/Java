package Array_study;

public class Array_1D {	
	    public static void main(String[] args) 
	    {
	    	int a=3;
	    	int b=2;
	    	int c;
	    	c=a%b;
	    	System.out.println(c);
	    	System.out.println("***************************************");
	        // Declaration of Array
	        int[] number;
	        
	        // Construction of Array with given size 
	        // Here we are giving size 10 it mean it can hold 10 values of int type
	        number =  new int[10];
	        
	        // Initialization of Array
	        number[0] = 11;  number[1] = 22; number[2] = 33;number[3] = 44;
	        number[4] = 55; number[5] = 66;  number[6] = 77;
	        number[7] = 88;number[8] = 99;number[9] = 100;
	        
	        //Print the values from Array
	        for(int i = 0; i <=9; i++)
	        {
	            System.out.println(number[i]);
	        }
	        
	        for(int i=9; i>=0; i--)
	        {
	        	System.out.println(number[i]);
	        }
	        System.out.println("777777777777777777777777777777777777777");
	        for(int i=0; i<number.length; i++)
	        {
	        	if(number[i]%2==0){
	        			        	
	        	System.out.println("evensize"+number[i]);
	        	}
	        	      	
	        }
	        }
	    }
	        
	    
	    
	