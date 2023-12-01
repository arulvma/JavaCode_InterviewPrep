package pgmFrmSubas;

class DemoInterface implements A {

public int add(int a,int b) {
 System.out.println("the addition value is : "+(a+b));
 return a+b;
}

public void printString(String abc) {
System.out.println("the value of parameter is :"+abc);
}

  public static void main(String[] args)
     { 
	 
	 
	 System.out.println("Im from Main method");
	 DemoInterface obj = new DemoInterface(30);
	 System.out.println("the addition value od A and B is : "+obj.add(30,20));
	 
	 obj.printString("Subash");
	 
	 }
	 
	 DemoInterface(int a) {
		 
		 System.out.println("Im from Constructor and my value is "+a);
	 }

}