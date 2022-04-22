package exception_handling;

public class Exception_Handling {
	
	int f=5;
	Exception_Handling eh;
	public void m8()
	{
	try
	{
	    System.out.println(eh.f);
	}
	catch(ArithmeticException e) 
	{
		System.out.println("Arithmatic exception");
	}
	catch(NullPointerException npe)
	{
		System.out.println("null pointer exception");
	}
	catch(StringIndexOutOfBoundsException si)
	{
		System.out.println("String Index Out of Bound Exception");
	}
	
	catch (Exception e1)
	{
		System.out.println("exception arrived");
	}
	
	}
	
	
	

	public static void main(String[] args) {
	
		// Arithmatic exception
	
	int a=10;
	int z= 0;
	int x;
	try
	{
		 x= a/z;
	
	}
	catch (ArithmeticException e)
	{
		System.out.println("arithmatic exception");
		z=1;
	}

	// null pointer exception
	 
	Exception_Handling k=new Exception_Handling();
	k.m8();
	
	// String index out of bound exception
	 
//	String s= "pratik"
	
	

	
	

	
	
	
	
	
	
	
	
	
	}
}
