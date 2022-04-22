package constructor;

import assignments.AmOverride2C;

public class AmOverriding1f {
  
	
	protected void m1 ()
	{
		System.out.println("AmOverride parent");
	}

	
	 public static void main(String[] args) 
	 {
		 
		 AmOverriding1f p=new AmOverride2C();
		 p.m1();
		 
		 AmOverriding1f p1=new AmOverriding1f();
		 p1.m1();
		 
		
		 
	}
}
