package interview_programs;

public class PrePostIncDec {
	//Referred from: //https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html
	
	/*
	 * The increment/decrement operators can be applied before (prefix) or after
	 * (postfix) the operand. The code result++; and ++result; will both end in
	 * result being incremented by one. The only difference is that the prefix
	 * version (++result) evaluates to the incremented value, whereas the postfix
	 * version (result++) evaluates to the original value. If you are just
	 * performing a simple increment/decrement, it doesn't really matter which
	 * version you choose. But if you use this operator in part of a larger
	 * expression, the one that you choose may make a significant difference. The
	 * following program, PrePostDemo, illustrates the prefix/postfix unary
	 * increment operator:
	 */	
	    public static void main(String[] args){
	        int i = 3;
	        
	        i++;
	        
	        System.out.println(i);// prints 4
	        ++i;			   
	       
	        System.out.println(i); // prints 5
	       
	        System.out.println(++i); // prints 6
	        
	        System.out.println(i++);// prints 6
	       
	        System.out.println(i); // prints 7
	    }

}
