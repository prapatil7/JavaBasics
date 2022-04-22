package oops_polymorphism;

public class Overriding 
{
	static int a=10;
	int b=25;
	
	public void m1() {
		System.out.println("m1 method parent");
	}
	
	private void m2() 
	{
		System.out.println("m2 method parent");
	}
	
	protected void m3()
	{
		System.out.println("m3 method parent");
	}
	
	void m4()
	{
		System.out.println("m4 method parent");
	}

	public void m6()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Overriding n=new Overriding();
		n.m6();
		
	}
	

}
