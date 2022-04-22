package mockgroup9;


public class StaticMethodClass1 
{
	public static void m1 () 
	{
		int a = 48;
		int b = 898;
		int g = 987;
		int h= a+b+g;
		
	    String s = "The addition of in integers ";
	    System.out.println(s + h);
		NonStaticClass1 q=new NonStaticClass1();
		q.m3();
		q.m4();
		}
	
	public static void m2 () 
	{
		int d=89;
		int j=78;
		int t=d-j;
		System.out.println(t);
	}
	
	public static void main(String[] args) {
		
		m1();
		m2();
		NonStaticClass1 k=new NonStaticClass1();
		k.m3();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
