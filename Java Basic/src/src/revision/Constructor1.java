package revision;

public class Constructor1 {

	public Constructor1()
	{
		int a=4587;
		boolean b= a>=50000;
		if (a>=50000)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(b);
		}
	}
	public Constructor1(int b)	
	{
	     this();
		if (b%2==0)
		{
			System.out.println("it is even no.");
		}
		else
		{
			System.out.println("it is odd no.");
		}
	}
	
	public Constructor1(int i, int j)
	{    this(98);
		if (i%5==0 && j%5==0)
		{
			System.out.println("divisible");
		}
		else
		{
			System.out.println("not divisible");
		}
	}
	public Constructor1(double a, double b, double c)
	{    this(15,156);
		if (a==b & b==c)
		{
			System.out.println("a=b=c");
		}
		else
		{
			System.out.println("a,b,c are no equal");
		}
	}
	public static void main(String[] args) {
		
		Constructor1 d=new Constructor1(50,51,50);
		
	}

}
