package pgmFrmSubas;

class Malgova extends Mango
{


  public static void main(String[] args)
     { 
	 System.out.println("Im from Main method of Malgova Class");
	 Malgova obj3 = new Malgova();
	 obj3.sampleMango();
	 obj3.add();
	 obj3.sample();
	 obj3.sampleMalgova();
	 }
	 
	 public void sampleMalgova() {
	  System.out.println("Im from sampleMalgova method of Malgova Class");
	  Malgova obj4 = new Malgova();
	  System.out.println("Im from sampleMalgova method of Malgova Class: " + obj4.a);
	  //obj2.add();
	 }
	 
	 public void sample() {
	  System.out.println("Im from sample method of Malgova with some modifivcation ");
	  int c;
	  int a=999,b=888;
	  c=a+b;
	  System.out.println("The value of C is  " +c);
	 } 

}