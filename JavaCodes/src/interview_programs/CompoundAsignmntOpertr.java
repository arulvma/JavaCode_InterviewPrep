package interview_programs;

public class CompoundAsignmntOpertr {
	//Compound assignment:
	
	//To create compound assignments, we can also combine the arithmetic operators with the simple assignment operator.
	//For example, x+=1; and x=x+1; both increment the value of x by 1.
	//In the factorial program this Compound assignment operator is used to achieve the expected result
	//we can refer the FactorialUsingIteration class for how we use it in that class
	
	public static void main(String[] args) {

		int x = 5,  y = 5;
		
		x += 1; //x = 6
		y = y +1; //y = 6
		
		System.out.println("The value of x :"+x);
		System.out.println("The value of y :"+y);
		
		
		int a = 7,  b = 7;
		
		a *= x; //a = 42
		b = b *y; //b = 42
		
		System.out.println("The value of x :"+a);
		System.out.println("The value of y :"+b);
		
		int c = 2,  d = 2;
		
		c *= 7; //a = 42
		d = d *7; //b = 42
		
		System.out.println("The value of x :"+c);
		System.out.println("The value of y :"+d);
		
		
		

	}

}
