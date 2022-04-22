package mockgroup9;

public class MethodCall {
    public static void main(String[] args)
    {
    	
    	// static methods from another class
    	
		Static_Method4.additionMethod();
		Static_Method4.substractionMethod();
		Static_Method4.multiplicationMethod();
		Static_Method4.divisionMethod();
		
		// non static methods from another class
		
	    Static_Method4 i=new Static_Method4();
	    i.addition();
	    i.substraction();
	    i.multiplication();
	    i.division();
	    
	} 
    
  // static to static 
    
    public static void m1 ()
    {
    	 Static_Method4.additionMethod();
    	 Static_Method4.substractionMethod();
   	     Static_Method4.multiplicationMethod();
   	     Static_Method4.divisionMethod();   	    	
    }
   
  
    
    
    
}

