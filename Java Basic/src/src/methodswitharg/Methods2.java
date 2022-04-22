package src.methodswitharg;

public class Methods2 {
	
	static int a1=78;
	static int a2= 878;	
	// method types and operators
	// method without return type without argument
	// addition-subtraction operators 
	public static void m1 ()
	{
		int a=50;
		int b =51;
		int sum = a+b;
		System.out.println("the sum is " + sum);
	}
        public void m2 ()
        {
           int subtraction = a1-a2;
           System.out.println("the subtraction is " + subtraction);
        }
	
	// method with argument without return type
        // multiplication operator
        
       public static void m3(int a, int b)
       {
    	   a=a1;
    	   b=a2;
    	   int multiplication= a1*a2;
    	   System.out.println("the product of both integers is " + multiplication);
       }
    	  public void m4 (boolean b, char c)
    	   {
    		  double a =58.563;
     		 double h =45.895;
     		  double division= a/h;
     		  System.out.println("division is " + division);
     	   }
    	  
    	  // method with return type without argument
    	  
    	  public static boolean m5()
    	  {
    		 Methods2 p=new Methods2();
    		 p.m4(true, 's');
    	      a1=45;
    	      a2=58;
    	      int modulo = a1%a2;
    	      System.out.println(modulo);
    	      return true;
    	     
    	  
       }
        
    	  
	public static void main(String[] args) {
		m1();
		Methods2 k=new Methods2();
		k.m2();
		m3(85, 38);
        m5();
        
	}
	
	
	
	
	
	
	
	
	
	
	

}
