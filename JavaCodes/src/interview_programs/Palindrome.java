package interview_programs;

public class Palindrome {
	//Source: TestLeaf 
	public void whtherPali(String pali) {
		
		String rev = "";
		//System.out.println("String pali valu is: "+pali);
		
		int strPalLen = pali.length();
		
		for(int i = strPalLen - 1; i >= 0; i--) {
			rev = rev + pali.charAt(i);
			//System.out.println("String rev value is: "+rev);
		}	
		
		//System.out.println("String rev value is: "+rev);
		
		boolean whtherPali = pali.equals(rev);
		
		if(whtherPali == true) {
			System.out.println("Input String is "+pali+" and is a PALINDROME");
		}
		else if(whtherPali == false){	
			System.out.println("Input String is "+pali+" and is NOT a PALINDROME");
		}		 
	} 
	
	public static void main(String[] args) {
		
		Palindrome palObj = new Palindrome();
		String inputStr = "mamq"; 
		//if give input string as Madam in inputStr then output is: not a Palindrome
		//actually if read the string "Madam" in reverse looks palindrome but it isn't
		//this is because, compiler checks the ASCII value since M and m aren't same ASCII value it prints as: not a Palindrome

		palObj.whtherPali(inputStr.toLowerCase()); //to fix this conflict, must change the String into either lower or upper case	
		//palObj.whtherPali(inputStr.toUpperCase());
		//palObj.whtherPali(inputStr);
	}

}