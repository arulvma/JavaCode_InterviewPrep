package pgmFrmSubas;

class DemomethodCalling
{
	
	int a=10,b=20;
	static int c=99;
    
	{
		System.out.println("Im from non static block");
		printa();
	}
    static 
    {
		System.out.println("Im from static block");
		new DemomethodCalling().printa();
	}
    public void printa() 
	{
	   
		System.out.println("Im from printa method");
	}
	
	public void printc() 
	{
	
	System.out.println("Im from the printc method");
	printa();
	System.out.println("Im from the printc method-II");
	   
	}
	 
	public static void main(String[] args)
     { 
	  DemomethodCalling obj = new DemomethodCalling();
	  System.out.println("Im from Main method");
	  obj.printc();
	  System.out.println("Im from Main method-II");
     }
	 
	  static 
    {
		System.out.println("Im from static block-II");
		
	}
	
	public void printX() 
	{
	
	System.out.println("Im from the printX method");
	
	}
}