package returntype;

public class MethodTypesReturnTypes {
	
	// 1) method without return type without argument
	
	public static void m1 ()
	{
		System.out.println("m1 with argument is executing");
	}
	
	public void m2 ()
	{
	      int a=45;
	      int b=86;
	      
	      if (a>b)
	      {
	    	  System.out.println("a is greater");
	      }
	      else
	      {
	    	  System.out.println("b is greater");
	      }
	}
	// 2) Method with argument wihout return type
	
	public static void m3 (boolean j, float f)
	{
		System.out.println(f+ " "+ j);
	}
	
	public void m4 (String s, char a)
	{
		System.out.println(s);
		System.out.println(a);
	}
	  // 3) with return type without argument

	public static String m5(int k, boolean j, float l)
	{
		System.out.println(k);
		System.out.println(j+ ""+ l);
		return "return type";
	}
	public int m6 (boolean z)
	{
		System.out.println(z);
		return 45;
	}
	
	// 4) method with return type with argument
	
	public static double m7(char k)
	{
		System.out.println("the character is " +k);
		return 53.28;
	}
	
     public long m8 (String h)
     {
    	 System.out.println(h);
    	 long l=4589651252l;
    	 return l;
     }
   public static void main(String[] args) 
   
  {
	  MethodTypesReturnTypes n=new MethodTypesReturnTypes();
	m1();
 	n.m2();
 	
    m3(true, 50);
	n.m4("SQL DEVELOPER", 'G');
	
	m5(458, false, 8l);
	int returnvalue1 =n.m6(false);
	System.out.println(returnvalue1);
	
   double j = m7('X');
   System.out.println(j);
   
   long d= n.m8("M8 IS EXECUTED");
   System.out.println(d);

    
  }
}
