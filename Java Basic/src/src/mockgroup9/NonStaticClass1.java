package mockgroup9;

public class NonStaticClass1 {
	
	public void m3 () 
	{
		int k=89;
		int l=5;
		int o = k*l;
		System.out.println(o);
	}
	
	public void m4 ()
	{
		int p=456;
		int n=4;
		int x=p/n;
	
		System.out.println(x);
		
		
		
		StaticMethodClass1.m1();
	}
	
	
	public static void main(String[] args)
	{
		NonStaticClass1 r=new NonStaticClass1();
		r.m4();
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
