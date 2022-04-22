package exception_handling;

import java.util.concurrent.ExecutionException;

public class TryCatch {
	
public static void main(String[] args) {
	
	int a=50;
	int b=0;
	int c;
	
	try
	{
		c=a/b;
	}
	catch (NullPointerException e)
	{
		System.out.println(" exception");
	}
	catch (ArrayIndexOutOfBoundsException e2)
	{
		System.out.println("exception");
	}
	catch(ClassCastException e3 )
	{
		System.out.println("exception");
	}
	catch (ArithmeticException e4)
	{
		System.out.println("arithmatic exception arrived");
	}
	
}
}
