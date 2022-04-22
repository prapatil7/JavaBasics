package oops_polymorphism;

public class OverridingChild1 extends Overriding {
	
	static int a=20;
	int b=30;
	
	
	public void m1() {
		System.out.println("m1 method child");
	}
	protected void m3() {
		System.out.println("m3 method child");
	}
	
	void m4()
	{
		System.out.println("m4 method child");
	}
	
	public void m5() {
		System.out.println("m5 method child");
		
	}
	
	

	public static void main(String[] args) 
	{
		Overriding n=new OverridingChild1();     // it is one of the method to call the child class method when overriding is there
		n.m1();
		n.m3();
		n.m4();
	    System.out.println(a);
	    System.out.println(n.b);
	
		OverridingChild1 n2=new OverridingChild1();
		n2.m5();
		System.out.println(n2.b);
		System.out.println(n2.a);
		
		Overriding n1=new Overriding();        // for parent class method we create an object on the basis of parent class itself
		n1.m1();
		n1.m3();
		n1.m4();
		System.out.println(n1.a);
	}
}

