package exception_handling;

public class ExceptionHandling {
	
	public static void main(String[] args) 
	{
		
		int i=10;
		int j=0;
		int k;
		try 
		{

		  k=i/j;
				
		}
		catch (ArithmeticException e)
		{
			System.out.println("arithmatic exception arrived");
			k=1;
		}	
	}
}
