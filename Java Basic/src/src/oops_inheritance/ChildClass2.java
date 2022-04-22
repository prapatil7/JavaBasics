package oops_inheritance;

public class ChildClass2 extends FatherClass {
	String S= "Globle variable";
	public void m5()
	{
		System.out.println("m5 is excuting");
		System.out.println(super.d);
	}
	
	public void m6()
	{
		System.out.println("m6 is executing");
		System.out.println(this.S);
	}
	
	public static void main(String[] args) {
		
		ChildClass2 v=new ChildClass2();
		v.m5();
		v.m6();
		v.m1();
		m2();
		
	
			
    		
	}
}
