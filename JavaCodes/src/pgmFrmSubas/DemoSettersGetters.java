package pgmFrmSubas;

class DemoSettersGetters {

	static String cname = "Cognizant";
		   int eid;
		   String ename;
		   
	
	void setEid (int eid) {
		this.eid = eid;
	}
	
	void setEname (String ename) {
		this.ename = ename;
	}
	
	int getEid() {
	  return eid;
	}
	
	String getEname() {
	  return ename;
	}
	
	
	public static void main(String[] args)
     { 
	  DemoSettersGetters obj = new DemoSettersGetters();
	  obj.setEid(701943);
	  obj.setEname("Subash P");
	  System.out.println("Conmpany name: "+cname+" Employee name: "+obj.getEname()+" Employee ID: "+obj.getEid());
	  DemoSettersGetters obj1 = new DemoSettersGetters();
	  obj1.setEid(701944);
	  obj1.setEname("Harini");
	  System.out.println("Conmpany name: "+cname+" Employee name: "+obj1.getEname()+" Employee ID: "+obj1.getEid());
      DemoSettersGetters obj2 = new DemoSettersGetters();
	  obj2.setEid(701945);
	  obj2.setEname("Karthika");
	  System.out.println("Conmpany name: "+cname+" Employee name: "+obj2.getEname()+" Employee ID: "+obj2.getEid());
	  /*cname = "Wipro";
	  DemoSettersGetters obj3 = new DemoSettersGetters();
	  obj3.setEid(111111);
	  obj3.setEname("Raghu");
	  System.out.println("Conmpany name: "+cname+" Employee name: "+obj3.getEname()+" Employee ID: "+obj3.getEid());
	  System.out.println("Conmpany name: "+cname+" Employee name: "+obj2.getEname()+" Employee ID: "+obj2.getEid());*/
	  
     }

}