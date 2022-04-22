package revision;

public class MethodPractice2 {

	public static void m3 ()
	{
	  int num1= 1;
	   while(num1<=51)
	   {
		   if (52%num1==0)
		   {
			   System.out.println(num1 +" it is prime no.");
		   }
			   
		   else
		   {
			   System.out.println(num1 +" it is not prime no.");
		   }  
		    num1++;
	   }
	}
	
	public void m4() {
		String s="non static method";
		boolean t= true;
		m5();
		MethodPractice1.m6();
	}
	
	
	public void m5 ()
	{
		int i=1;
		int j=52;
		int k=i%j;
		System.out.println(k);
	}
	public static void main(String[] args) {
		m3();
		MethodPractice1.m1();
		MethodPractice1 b=new MethodPractice1();
		b.m2();
		MethodPractice2 c=new MethodPractice2();
		c.m4();
				
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	

