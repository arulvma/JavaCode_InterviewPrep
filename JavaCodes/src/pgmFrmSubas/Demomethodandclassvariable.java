package pgmFrmSubas;

class Demomethodandclassvariable
{
	
	int a=10,b=20;
	int c=23;

 
    public void printaandb(int a, int b) 
	{
	   
		System.out.println("the method level a value is: "+a+" the method level b value : "+b);
		
		
		System.out.println("the class level a value is: "+this.a+" the class level b value : "+this.b); // this is a keyword refers class level variables and this is an implicit object.
		
		System.out.println("the class level c value is: "+this.c);
		System.out.println("the class level c value is: "+c);
	}
	 
	public static void main(String[] args)
     { 
	  Demomethodandclassvariable abc = new Demomethodandclassvariable();
	  abc.printaandb(34,63);
	  abc.printaandb(999999,88888);
     }
}