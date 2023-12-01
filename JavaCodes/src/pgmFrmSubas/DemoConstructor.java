package pgmFrmSubas;

class DemoConstructor
{
	
	static 
	{
		
		System.out.println("Im from static bolck");
	}
	
	{
		
		System.out.println("Im from non static bolck");
	}
	    
	public void printa() 
	{
	   
		System.out.println("Im from printa method");
		new DemoConstructor();
	}
	
	public void printc() 
	{
	
	System.out.println("Im from the printc method");
	printa();
	System.out.println("Im from the printc method-II");
	   
	}
	 
	 
	DemoConstructor() {
	  System.out.println("Im from Constructor");
	 }
	 
	public static void main(String[] args)
     { 
	  DemoConstructor obj = new DemoConstructor();
	  System.out.println("Im from Main method");
	  obj.printc();
	  System.out.println("Im from Main method-II");
     }
	 
	
	public void printX() 
	{
	
	System.out.println("Im from the printX method");
	
	}
}