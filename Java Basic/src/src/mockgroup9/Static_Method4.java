package mockgroup9;

public class Static_Method4 
 {
	public static void  additionMethod () {
		int a = 32;
	    int b = 54;
	    int c = a + b;
	   System.out.println(c);
	}
	
    public static void substractionMethod () {
    	int d = 500;
    	int s = 2;
    	int f = d-s;
    	System.out.println(f);
    
    }
	
	
	public static void multiplicationMethod () {
		int g =51;
		int h = 54;
		int k=g*h;
		System.out.println(k);
		
	}
	 public static void divisionMethod () {
		 int l = 80;
		 int y = 10;
		 int m = l/y;
		 System.out.println(m);
				
	 }

	
	public void addition () 
	{
		int a = 500;
		int b = 1000;
		int c = a + b;
		System.out.println("the sum of both no.s is " + c);
	}
	
	public void substraction ()
	{
		int k = 899;
		int j = 568;
		int o = k-j;
		System.out.println("the difference of both the numbers is " + o);	
		}
	
	public void multiplication ()
	{
		int p = 654;
		int t = 54;
		int y=p*t;
		System.out.println(y);
				
	}
	
	public void division ()
	{
		int s= 87;
		int q = 45;
		int u = s/q;
		System.out.println(u);
	}
	
	
	
	public static void main(String[] args) {
		
	
		
		additionMethod();
		Static_Method4 k=new Static_Method4();
		k.multiplication();
	}
	
	
	// from static to static (method to method) 
	
	public static void m1 () {
		
		additionMethod();	
	
	}

	// from non static to static
	
	public static void m2 () 
	{
		
	}
	
	  
	   

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
