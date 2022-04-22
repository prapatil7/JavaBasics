package constructor;

public class Test {
	public Test ()
	{
		System.out.println("hello");
	}

	
	
	public Test (boolean a)
	{ this ();
		System.out.println("one argument");
	}
	
	public Test (char a, int b)
	
	{  this (true);
		System.out.println("two arguments");
	}
	
	
	public Test (char a, boolean b, String s)
	{    this ('A', 12);
		System.out.println("three arguments");
	}

	public static void main(String[] args) {
		
		Test n=new Test('A', false, "yes");
		
	}
	
	
}
