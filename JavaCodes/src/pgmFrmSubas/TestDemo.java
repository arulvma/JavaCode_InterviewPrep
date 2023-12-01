package pgmFrmSubas;

class TestDemo
{
	static int x=3;
	int  c=22;
	
		static {
		
		new TestDemo().print();
		new TestDemo().print();
		System.out.println("Im from SB-1");
	}
	
	
	{
		System.out.println("Im from NSB-1");
	}
 public static void main(String[] args)
 { 
 	TestDemo abc = new TestDemo();
	System.out.println("the value of x is "+x);
	System.out.println("the value of c is "+abc.c);
	abc.print();
 }
 
 
	{
		System.out.println("Im from NSB-2");
	}
	
	static {
		System.out.println("Im from SB-2");
	}
	
	void print() {
		System.out.println("the value of c from NSM is "+c);
	}
	
}