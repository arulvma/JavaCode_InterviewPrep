package interview_programs;

public class FactorialUsingIteration {
	
	//Referred from https://www.geeksforgeeks.org/java-program-for-factorial-of-a-number/
	
	 static int factorial(int n) 
	    { 
	        int res = 1, i; 
	        
	        for (i = 2; i <= n; i++) 
	        	System.out.println("value of res before multiplication "+res);
	            res *= i; 
	            System.out.println("value of res after multiplication "+res);
	        return res; 
	    } 
	  
	    // main method 
	    public static void main(String[] args) 
	    { 
	        int num = 5; 
	        System.out.println("Factorial of " + num + " is "
	                           + factorial(num)); 
			/*
			 * System.out.println("Factorial of " + num + " is " + factorial(5));
			 */
	    } 

}

//5! = 5*4*3*2*1 