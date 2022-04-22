package mock_practice_1;

public class Mock
{
	public static void main(String[] args) 
	{
	int i =50;
	int j=60;
	if(i==0)
	{
	throw new ArithmeticException();
	}
	
	else if(j==0)
	{
		throw new NullPointerException("Please try after sometime");
		
	}
	
	
	System.out.println("last line after the exception");
}
}
			
			
		

		
//		
//		try
//		{
//			int c=a/b;
//			System.out.println(c);
//		}
//	
//		
//		finally
//		{
//			System.out.println("Please try after some time");
//		}
//		
//		
		
		
		
	
	
