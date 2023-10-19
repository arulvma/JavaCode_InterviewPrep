package interview_programs;

public class Swap2NumWout3rdVar { 	 
	//Referred from:  https://www.geeksforgeeks.org/java-program-to-swap-two-numbers/
	//NOTE: without using the method named: swapValuesWithoutUsingThirdVariable, we can achieve the expected result
	
	//Algorithms: 
		//Difference of second number from the first number is stored in memory cell where first number was already stored.
		//Sum of both the numbers  is stored in second memory cell(number).
		//Difference of first number from the second is computed and stored in memory cell where at initial first value was stored.
		//Below is the implementation of swapping the numbers without creating any auxiliary space in memory:
		
	// Function to swap values of two numbers without creating temp variable
    static void swapValuesWithoutUsingThirdVariable(int m, int n)
    {
        // Steps as listed in algorithm
 
        // Difference of 2nd from 1st
        // is stored in first variable
        m = m - n;
 
        // Sum is stored in second variable
        n = m + n;
 
        // Difference of 1st from 2nd
        // is replaced in first variable
        m = n - m;
 
        // Print numbers
        //System.out.println("Value of m is " + m + " and Value of n is " + n);
        System.out.println("After swapping, vlaue of m is: "+m);
        System.out.println("After swapping, vlaue of n is: "+n);
    }
 
    public static void main(String[] args)
    {
        // Random numbers of integer type
        int m = 9, n = 5;
        System.out.println("Before swapping, actual vlaue of m is: "+m);
        System.out.println("Before swapping, actual vlaue of n is: "+n);
        // Above function is called in main
        // to print swapped values of numbers
        swapValuesWithoutUsingThirdVariable(m, n);
    }
}


	
	