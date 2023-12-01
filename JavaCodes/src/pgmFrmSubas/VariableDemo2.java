package pgmFrmSubas;

class VariableDemo2	{
	
   int a = 2,b;//Class level Non-Static variable 
	   
   void method1(int x, int y) {
		a = x;
		b = y;
		
	    System.out.println("the value of a is, "+a);
	    System.out.println("the value of b is, "+b);   
}	   
   static void method2(String m, VariableDemo2 obj ) {
	   
	   int a = 12;
	   //obj.a = 100;
	   System.out.println("the value of a is, "+a);
	   
	   System.out.println("\n***********************");
	   System.out.println("the value of m is, "+m);
	   System.out.println("Obj reference value is,----------- "+obj);
	   
	   System.out.println("the value of a is, "+obj.a);
	   
	   System.out.println("the value of b is, "+obj.b);
}   
	   
 public static void main(String[] args)	{ 
 
   VariableDemo2 obj1 = new VariableDemo2();
   obj1.a = 100;
    System.out.println("Class level Non-Static variable a value is, "+obj1.a);
    System.out.println("Class level Non-Static variable b value is, "+obj1.b);
	System.out.println("reference value of obj1 is,----------- "+obj1);
	
    obj1.method1(23,56);
   
    method2("Harini", new VariableDemo2());
    method2("Karthika", obj1);
    
    System.out.println("a is, "+obj1.a);
    System.out.println("b is, "+obj1.b);
 	
 }
 
}