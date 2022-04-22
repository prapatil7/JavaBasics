package oops_polymorphism;

public class Polymorphism1 {
	public static void  m1 (String s, int k)
	{
		System.out.println("m11");
	}
	
	public void m1()
	{
		System.out.println("m12");
	}
	
	public static boolean m2(char k, int b)
	{
		System.out.println("m21");
		return false;
	}
	public char m2(int k)
	{
		System.out.println("m22");
		return 'A';
	}
	
	public static void main(String[] args) 
	{
		m1("hello", 212);
		Polymorphism1 n=new Polymorphism1();
		n.m1();
		boolean retvalue= m2('a', 100);
		System.out.println(retvalue);
		n.m2(110);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
