package pgmFrmSubas;

class ObjstaticDemo
{
	
	int a=10,b=20;
    static ObjstaticDemo sobj = new ObjstaticDemo();
 
    public static void printab() 
	{
	   /* ObjstaticDemo abc = new ObjstaticDemo();
		System.out.println("the value of a is: "+abc.a);
		System.out.println("the value of b is: "+abc.b);*/
		
		System.out.println("the value of a is: "+sobj.a);
		System.out.println("the value of b is: "+sobj.b);
	}
	
	public static void printaandb() 
	{
	    /*ObjstaticDemo abc = new ObjstaticDemo();
		System.out.println("the value of a is: "+abc.a+" the value of b is: "+abc.b);*/
		
		System.out.println("the value of a is: "+sobj.a+" the value of b is: "+sobj.b);
	}
	 
	public static void main(String[] args)
     { 
	  printab();
	  printaandb();
     }
}