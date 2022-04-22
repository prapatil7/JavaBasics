package returntype;

public class MethodWithReturnType {
	// 1) method with no return type no argument
	public static void m1 ()
	{
		char a= 'A';
		System.out.println(a);
	}
	// 2) method with no return type and argument
	public static void m2 (int a, int b) 
	{	
		int c= a*b;
		System.out.println(c);	
	}	
	public void m3 (String d, boolean c, char g) 
	{
	System.out.println(c);
	System.out.println(g);
	System.out.println(d);
	}
	// 3) method with return type without argument
     public static String m4 ()
     {
    	 System.out.println("name");
    	 String a = "Name";
    	 return a;
     } 
     public int m5 ()
     {
    	 System.out.println(23);
    	 int p=12;
    	 return p;
      }
     // 4) method with return type with argument
     public static String m6(String p)
     {
    	System.out.println(true);
    	String j= "True";
    	return j;
     }
     public short m7(boolean q)
     {
    	 System.out.println(false);
    	 short z= 4656;
    	 return z;
     }    
    public static void main(String[] args)
	{
		m1();
		m2(2, 3);
		MethodWithReturnType n=new MethodWithReturnType();
		n.m3("pratik", true, 'f');
	    m4();
	    n.m5();
	    m6("no");
	    n.m7(false);    
	}	
}
