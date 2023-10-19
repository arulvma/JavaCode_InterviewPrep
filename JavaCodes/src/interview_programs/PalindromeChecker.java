package interview_programs;

//Referred URL:geeksforgeeks
public class PalindromeChecker {	
	
	    public static void main(String[] args) {	        
	    	
	    	System.out.println("Main method: Am I run first");	    	
	    	String input = "MAM2"; // Change this to the string you want to check
	        System.out.println("Actual input length is: "+input.length());
	        
	        if (isPalindrome(input)) {	        	
	        	System.out.println(isPalindrome(input));
	        	System.out.println("entered isPalindrome method");
	            //System.out.println(input + " is a palindrome.");
	            System.out.println(input.replaceAll("\\s", "") + " is a palindrome.");
	        } else {
	        	System.out.println(isPalindrome(input));
	            //System.out.println(input + " is not a palindrome.");
	            System.out.println(input.replaceAll("\\s", "") + " is not a palindrome.");
	        }
	    }

	    public static boolean isPalindrome(String str) {
	        // Remove spaces and convert to lowercase for a case-insensitive check
	    	System.out.println("isPalindrome method: Am I run first");
	    	
	        str = str.replaceAll("\\s", "").toLowerCase();
	        System.out.println("when using replaceAll method then the input length is: "+str.length());

	        int left = 0;
	        int right = str.length() - 1;

	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	            	System.out.println("leftChar "+str.charAt(left));
	            	System.out.println("rightChar "+str.charAt(right));
	                return false; // Characters don't match, so it's not a palindrome
	            }

	            left++;
	            right--;
	        }

	        return true; // If the loop finishes, it's a palindrome
	    }

}
