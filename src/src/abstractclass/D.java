package src.abstractclass;

public class D extends E {
	public void m10()
	{	
	     a.m1(); 
	     b.m5();     
	}
	public void m11 ()
	{	
		a.m3();	
	    b.m6();	 
		c.m9();	
	}
	public static void main(String[] args) {
		D n3=new D();
		n3.m10();
		n3.m11();
	}
}

