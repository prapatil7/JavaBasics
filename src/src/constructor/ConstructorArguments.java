package constructor;

public class ConstructorArguments 
{
 
	String studentsname;
	int mathmarks;
	int physicsmarks;
	int chemistrymarks;
	
	//by using constructors we can use arguments to reduce extra efforts to print multiple 
	// data by using the non static variables.
	
	public ConstructorArguments (String t, int p, int q, int r)
	{
		String studentsname = t;
		int mathsmarks= p;                // we can call the non static variable by using "this" keyword..
		int physicsmarks = q;             
		int chemistrymarks = r;	
		System.out.println(t);
	    System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		
	}
	public static void main(String[] args)
	
	{
		ConstructorArguments n=new ConstructorArguments("pratik", 70, 60, 88);
	    ConstructorArguments n1=new ConstructorArguments("shivam", 70, 76, 90);
	    ConstructorArguments n2=new ConstructorArguments("prabha", 66, 85, 76);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
