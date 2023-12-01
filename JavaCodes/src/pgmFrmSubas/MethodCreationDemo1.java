package pgmFrmSubas;

class MethodCreationDemo
{
	 int a=10,b=20,c;// class level non-static variable
	 static String s="Subash";
 public static void main(String[] args)
 { 
 	int x=68,y=34,z;
	z=x+y;
	System.out.println("the addition of x and y is: "+z);
	System.out.println("the value of s is: "+s);
	System.out.println("value of a is: "+new MethodCreationDemo().a+" value of b is: "+new MethodCreationDemo().b+" value of c is: "+new MethodCreationDemo().c);
	MethodCreationDemo obj = new MethodCreationDemo();
	obj.addaandb(); // object.methodname for nonstatic method  static method, method name.
	subractaandb();
	 subractaandb();
	  subractaandb();
	   subractaandb();
	   String k = obj.printHelloWorld();
	   System.out.println(k);
	   System.out.println(obj.printHelloWorld());
	   System.out.println(obj.printaddaandb());
	   add(12,36);
	    add(x,y);
		System.out.println(obj.sub(1098,89));
		System.out.println(obj.namePrint(s));
	   
 }
 
 public void addaandb()
 {	 
	 c=a+b;
	 System.out.println("the addition of a and b is: "+c);
	
 }
 
 public static void subractaandb()
 {
	 MethodCreationDemo obj = new MethodCreationDemo();
	 obj.c=obj.a-obj.b;
	 System.out.println("the subraction of a and b is: "+obj.c);
 }
 
 String printHelloWorld()
 {
	 return "Im from JAVA HELLO WORLD METHOD";
 }
  
 int printaddaandb()
 {
	c=a+b;
	 return c;
 }
 
 public static void add (int a, int b) {
	 int c;
	 c=a+b;
	 System.out.println("addition value of and b from Parameterized method is: "+c);
	 
 }
 
 int sub(int a, int b) {
	 c=a-b;
	 return c;
 }
 
 String namePrint(String a) {
 return "My name is " + a;
 }
}