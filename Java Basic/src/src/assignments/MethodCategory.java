package assignments;

public class MethodCategory {
	
	//method without return type without argument
	
	public static void m1 ()
	{
		System.out.println("pratik");
	}
	
	public void m2 ()
	{
		System.out.println("shivam");
	}
	
	
	// method without return type with argument
	
	public static void m3 (int a, boolean b, int c)
	
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	
	public void m4 (char f, boolean g, String k) 	                    // bijali prakash dei olya 
	{
		
		System.out.println(f); 
		                      
		System.out.println(g);
		
		System.out.println(k);
		
		
		
		
		
		
		                                                                                // ekach ya jagii
	}
	
	
	
	// method with return type with argument
	
	public static String m4 ()
	{
		System.out.println("m4 with returntype");
		 String s  = "omkar";
		return s;
	}
	
	
	public int m5 ()
	{
		System.out.println("458");
		int u= 5;
		return u;
	}
	
	
	public static boolean m6 ()
	{
		System.out.println("m6 is executing");
		 return true;
		 
	}
	
	
	
	
	

	public static void main(String[] args) {
		m1();
		MethodCategory n=new MethodCategory();
		n.m2();
		
		m3(12, false, 845);
	    n.m4('a', true, "pratik");
		
		m4();
		n.m5();
		
		boolean g=m6();
	 
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
