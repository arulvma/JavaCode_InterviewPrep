package pgmFrmSubas;

class Blocksdemo {

    static int k;
	 
	static {	// Static block
		int i = 10, j=30;
		
		System.out.println("im from static block ");
		System.out.println("im from static block - 2nd ");
		k = i+j;		
		System.out.println("the value of K is "+k);
		new Blocksdemo();		
	}
		
	{//Non-static block
		System.out.println("im from non-static block I"); 					
	}
public static void main(String[] args)	{
	
	int x = 68;
	System.out.println("the value of x is "+x);
	
	System.out.println("hello good morning, im from main method - 1st sysout");
	System.out.println("im from main method - 2nd sysout");
	
	{//Non-static block
		System.out.println("im from non statuc block inside the static main method 1 ");
		new Blocksdemo();
		new Blocksdemo();
		System.out.println("the value of K is "+k);
	}
}

	{
		System.out.println("im from non-static block II ");
		
	}
}