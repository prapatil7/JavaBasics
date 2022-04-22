package operators;

public class OperatorsInJava
{
// arithmatic operators
	
    public static void arithmaticOperators(int a, int b)
    {
    	int c=a+b;
    	System.out.println("the sum of a and b is " +c);
    }
	public static void main(String[] args) 
	{
	  arithmaticOperators(45, 556);
	  OperatorsInJava n=new OperatorsInJava();
	  n.division(20, 520);
	boolean t = n.multiply(12,32);
	System.out.println(t);
	char m =substract(78, 29);
	  System.out.println(m);
		}
	
	public void division(double a, double b)
	{
	     double c= a/b;
	     System.out.println("the division is " + c);
	}
	
	public boolean multiply(int i, int j)
	{
		int k=i*j;
	    System.out.println(k);
		return true;
	}
	 
	public static char substract(int p, int q)
	{
		int r=p-q;
		System.out.println(r);
		return 'h';
		
	}
	
	// comparative operators
	

}
