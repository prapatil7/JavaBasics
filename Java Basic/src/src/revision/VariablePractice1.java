package revision;

public class VariablePractice1 {
	
	static int a=58;
	static int a1=64;
	public void m1()
	{
		boolean c=a%a1==0;
		if (a%a1==0)
		{
			System.out.println(c);
		}
		else
		{
			System.out.println(c);
		}
		
	}
	
	double d=90.32;
	double g=12.50;
	double h=63.25;
	public static void m2()
	{
	VariablePractice1 n=new VariablePractice1();
      boolean b1= n.d>n.g && n.d>n.h;
      if (n.d>n.g && n.d>n.h)
      {
    	  System.out.println(b1);
      }
      else 
      {
    	  System.out.println(b1);
      }
	}
	
	public static void main(String[] args) {
		VariablePractice1 n=new VariablePractice1();
		n.m1();
		
		m2();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
