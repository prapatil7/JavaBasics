package revision;

public class MethodPractice1 {
	
	
	public static void m1 ()
	{
		int a=45;
		int b=58;
		if (a==50 || b==58)
		{
			System.out.println("it is correct");
		}
		else
		{
			System.out.println("it is not correct");
		}
		MethodPractice2 d=new MethodPractice2();
	   d.m5();
	}
	public static void m6()
	{
		System.out.println("m6 is executing");
	}
	
	public void m2 ()
	{	
	    int num = 28;
	    if (num%2==0)
	    {
	    	System.out.println("even no.");
	    }
	    else
	    {
	    	System.out.println("odd no.");
	    }
	    m6();
	}
	
	
	public static void main(String[] args) {
		m1();
		MethodPractice1 a=new MethodPractice1();
		a.m2();
		
	}
	
	

}
