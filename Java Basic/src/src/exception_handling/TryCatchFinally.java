package exception_handling;

public class TryCatchFinally {
	public static void main(String[] args) {
		int i=10;
		int f=0;
		
		try
		{
			System.out.println(i/f);
		}
		catch(NullPointerException npe)
		{
			System.out.println("npe arrived");
		}
		catch(Exception eh)
		{
			System.out.println("arithmatic exception has arrived");
		}
		finally                                     // finally is used to end the program is server down any how if finaly is provided
		                                            // this will show the message to user and end the program for security purpose
		{
			System.out.println("please try after some time");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
