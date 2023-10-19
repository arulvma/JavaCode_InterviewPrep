package interview_programs;

public class UnaryOperator {
	//Referred from: //https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html
	
//The Unary Operators:	
	 //The unary operators require only one operand;
	 //they perform various operations such as incrementing/decrementing a value by one, negating an expression, or inverting the value of a boolean.

//Operator 	Description
	//+	 	Unary plus operator; indicates positive value (numbers are positive without this, however)
	//-	 	Unary minus operator; negates an expression
	//++	  	Increment operator; increments a value by 1
	//--	 	Decrement operator; decrements a value by 1
	//!	  	Logical complement operator; inverts the value of a boolean
	
	public static void main(String[] args) {

        int result = +1;
        // result is now 1
        System.out.println(result);

        result--;
        // result is now 0
        System.out.println(result);

        result++;
        // result is now 1
        System.out.println(result);

        result = -result;
        // result is now -1
        System.out.println(result);

        boolean success = false;
        // false
        System.out.println(success);
        // true
        System.out.println(!success);
    }

}
