package interview_programs;

public class IsAddorEvenNo {
	//Referred URL:
	//https://www.geeksforgeeks.org/java-program-to-check-if-a-given-integer-is-odd-or-even/

	public static void main(String[] args)
	{
		// Declaring and initializing integer variable
		int num = 101;

		// Checking if number is even or odd number
		// via remainder
		if (num % 2 == 0) {

			// If remainder is zero then this number is even
			System.out.println("Given Number "+num +" is Even");
		}

		else {

			// If remainder is not zero then this number is odd
			System.out.println("Given Number "+num +" is Odd");
		}
	}
}
