package pgmFrmSubas;

class Apple extends Fruit
{


  public static void main(String[] args)
     { 
	 System.out.println("Im from Main method of Apple Class");
	 Apple obj1 = new Apple();
	 obj1.sampleApple();
	 obj1.add();
	 obj1.sample();
	 }
	 
	 public void sampleApple() {
	  System.out.println("Im from sampleApple method of Apple Class");
	  Apple obj2 = new Apple();
	  System.out.println("Im from sampleApple method of Apple Class: " + obj2.a);
	  //obj2.add();
	 }

}