package interview_programs;

public class IsStrContainSubStr {
	
	public static void main(String[] args) {
	    // create a string
	    String strMain = "This is Programiz";
	    String subStr1 = "Programiz";
	    String subStr2 = "Programming";

	    // check if name is present in strMain
	    // using contains()
	    
	    boolean result = strMain.contains(subStr1);
	    
	    if(result) {
	      System.out.println(subStr1 + " is present in the string.");
	    }
	    else {
	      System.out.println(subStr1 + " is not present in the string.");
	    }

	    result = strMain.contains(subStr2);
	    
	    if(result) {
	      System.out.println(subStr2 + " is present in the string.");
	    }
	    else {
	      System.out.println(subStr2 + " is not present in the string.");
	    }
	    
	  }

}
