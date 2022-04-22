package methodswitharg;

public class MethodsCategories {
	// without argument and without return type
	public static void area ()
	{
		int a=12;
		int b=23;
		int c= a*b;
		System.out.println(c );
	}

	public void volume ()
	{
		int a=45;
		int b=45;
		int l=12;
		int c=a*b*l;
		System.out.println(c + " cubic metre");
	}
	
	// with argument without return type
	public static void m3 (boolean a, int b)
	{
		System.out.println(a + " "+ b);
	}
	
	public void m4 (char a, String b, int h)
	{
		System.out.println(a);
		System.out.println(b + " " + h);
	}
	
	// without argument with return type
	
	public static int m5 ()
	{
		System.out.println("hello");
		return 5;
	}
	public String m6 ()
	{
		System.out.println("M6 IS EXECUTING");
		return "m6 returned";
	}
	
	// with return type with argument,
	
	public static boolean m7 (String a)
	{
		System.out.println(a);
		return false;
		
	}
	      
	public char m8 (boolean a, int b, char g)
	{
		System.out.println(a + " " + b + " "+ g);
		return 'a';
	}
	public static void main(String[] args)
	{
		area();
		MethodsCategories n=new MethodsCategories();   // object defined(non static) 
		n.volume();
		m3(true, 5);
		n.m4('P', "method", 50);
		int retvalue = m5();
		System.out.println(retvalue);
		String p  = n.m6();
		System.out.println(p);
		m7("m7 executed");
		char retvalue1 =n.m8(false, 525, 'a');
		System.out.println(retvalue1);
	}
	
	
	
	
	
}
