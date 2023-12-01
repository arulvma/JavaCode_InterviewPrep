package pgmFrmSubas;

class DemoParameterizedConstructor
{
	
	int a,b,c;
	
	{
		
		System.out.println("Im from non static bolck");
	}
	    
	DemoParameterizedConstructor () {
	 
	  System.out.println("Im from npc - no parameterised constructor");
	  
	 }
	 
	 
	DemoParameterizedConstructor (int a, int b, String s) {
	 System.out.println(s);
	 this.a=a;
	 this.b=b;
	  c=a+b;
	  System.out.println("The value of C is : "+c);
	  
	 }
	 
	public static void main(String[] args)
     { 
	  DemoParameterizedConstructor obj = new DemoParameterizedConstructor();
	  System.out.println("Im from Main method");
	  obj.printX();
	  DemoParameterizedConstructor obj1 = new DemoParameterizedConstructor(12,33,"addition");
	  new DemoParameterizedConstructor(63,9999,"addition1");
	  DemoParameterizedConstructor obj2 = new DemoParameterizedConstructor(8888,6356,"addition2");
	  obj1.printX();
	  printz();
	  
	  Demomethodandclassvariable abc = new Demomethodandclassvariable();
	  abc.printaandb(34,63);
     }
	 
	
	public void printX() 
	{
	
	System.out.println("Im from the printX method");
	printY();
	printY(9999999);
	printY(888888,666666);
	printY("Subash",666666);
	printY(666666,"Subash");
	
	}
	
	public static void printz() {
		System.out.println("Im from the printZZZZZZZZZ method");
	}
	
	public void printY() 
	{
	
	System.out.println("Im from the printYYYYYY method");
	
	}
	
		public void printY(int a) 
	{
	
	System.out.println("Im from the printYYYYYY method and a value is "+a);
	
	}
	
			public void printY(int a, int b) 
	{
	
	System.out.println("Im from the printYYYYYY method and a value is "+a + " and b value is: "+b);
	
	}
	
	public void printY(String a, int b) 
	{
	
	System.out.println("Im from the printYYYYYY method and a value is "+ a + " and b value is: "+b);
	
	}
	
	public void printY(int a, String b) 
	{
	
	System.out.println("Im from the printYYYYYY method and a value is "+ a + " and b value is: "+b);
	
	}
	
		
}