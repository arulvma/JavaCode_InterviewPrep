package interview_programs;

public class IsStrHasSubStr_NoPreDefMethd {
	
	    public static boolean containsSubstring(String mainString, String subString) {
	    	
	        if (mainString == null || subString == null) {
	            return false;
	        }
	        
	        int mainLength = mainString.length();
	        int subLength = subString.length();
	        
	        for (int i = 0; i <= mainLength - subLength; i++) {
	            int j;
	            for (j = 0; j < subLength; j++) {
	                if (mainString.charAt(i + j) != subString.charAt(j)) {
	                    break;
	                }
	            }
	            if (j == subLength) {
	                return true; // Substring found
	            }
	        }
	        
	        return false; // Substring not found
	    }

	    public static void main(String[] args) {
	        String mainString = "Hello, World!";
	        String subString = "Hello";

	        if (containsSubstring(mainString, subString)) {
	            System.out.println("Substring found in the main string.");
	        } else {
	            System.out.println("Substring not found in the main string.");
	        }
	    }
}
