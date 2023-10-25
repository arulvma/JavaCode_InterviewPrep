package interview_programs;

public class FactorialUsingRecursive {
	
	//Referred from https://www.geeksforgeeks.org/java-program-for-factorial-of-a-number/
	
	static int factorial(int n) 
    { 
        if (n == 0 || n == 1) 
           return 1; 
  
        return n * factorial(n - 1); 
    } 
  
    // main method 
    public static void main(String[] args) 
    { 
        int num = 5; 
        System.out.println("Factorial of " + num + " is "
                           + factorial(num)); 
    } 

}
