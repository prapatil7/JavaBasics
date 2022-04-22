package oops_inheritance;

public class ChildClass1 extends FatherClass 
{
	public void m1(int a)
	{
		System.out.println("m1 is execuing");
	}
	
	public void m4()
	{
		System.out.println("m4 is executing");
	}

	
	public static void main(String[] args) 
	{
		ChildClass1 w=new ChildClass1();
		w.m1(20);
		w.m4();
		m2();
		w.m1();
		m2("HELLO");
	}
}
