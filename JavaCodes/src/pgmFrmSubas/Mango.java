package pgmFrmSubas;

class Mango extends Fruit
{


  public static void main(String[] args)
     { 
	 System.out.println("Im from Main method of Mango Class");
	 Mango obj1 = new Mango();
	 obj1.sampleMango();
	 obj1.add();
	 obj1.sample();
	 }
	 
	 public void sampleMango() {
	  System.out.println("Im from sampleMango method of Mango Class");
	  Mango obj2 = new Mango();
	  System.out.println("Im from sampleMango method of Mango Class" + obj2.a);
	  //obj2.add();
	 }
	 
	 public void sample() {
	  System.out.println("Im from sample method of Mango with some modifivcation ");
	  int c;
	  int a=10,b=15;
	  c=a+b;
	  System.out.println("The value of C is  " +c);
	 } 

}