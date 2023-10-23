package interview_programs;

public class FactorialUsingIteration {
	
	//Referred from https://www.geeksforgeeks.org/java-program-for-factorial-of-a-number/
	
	 static int factorial(int n) 
	    { 
		 //System.out.println("Value of n :"+n);
		 
		 if (n == 0 || n == 1) {
			 System.out.println("Entered if part");
			 return 1;
			 
		} else {
			System.out.println("Entered else part");
			 int res = 1, i; 
		        
		        for (i = 2; i <= n; i++)
		        	
		        	res *= i; //these both uncommented and commented statements produces a same results 
		        	//res = res *i;
		       
		        return res;
			}
		 
	   } 
	  
	    // main method 
	    public static void main(String[] args) 
	    { 
	        int num = 3; 
	        System.out.println("Factorial of " + num + " is "
	                           + factorial(num)); 
			/*
			 * System.out.println("Factorial of " + num + " is " + factorial(5));
			 */
	    } 

}

//5! = 5*4*3*2*1 