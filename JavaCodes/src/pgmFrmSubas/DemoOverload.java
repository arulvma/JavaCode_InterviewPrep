package pgmFrmSubas;

class DemoOverload
{


  public static void main(String[] args)
     { 
	 
	 
	 System.out.println("Im from Main method of Demooberload Class");
	 main(10);
	 
	 }
	 
	 public static void main(int a)
     { 
	 System.out.println("Im from overloaded main method "+a);
	 
	 }

}