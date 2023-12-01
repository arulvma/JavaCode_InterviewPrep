package pgmFrmSubas;

class VariableDemo	{
	
 static int a = 12, b = 43;
        int c = 3,  d = 7;
        
	 void method1() {
	   c = 100;
	   d = 34;
	   a = 3333;
		   System.out.println("the value of c is "+c);
		   System.out.println("the value of d is "+d);
		   System.out.println("the value of a is "+a);
		   System.out.println("the value of b is "+b);
	   }
	 
	void method2() {
	   System.out.println("the value of c is "+c);
	   System.out.println("the value of d is "+d);
	   System.out.println("the value of a is "+a);
	   System.out.println("the value of b is "+b);
}	  
	
 public static void main(String[] args)	{ 
   System.out.println("Object 1 data as follows .......");
   VariableDemo obj1 = new VariableDemo();
   obj1.method1();
   
   System.out.println("Object 2 data as follows .......");
   VariableDemo obj2 = new VariableDemo();
   obj2.method2();
 	
}
 
}