package constructor;

public class Constructors1
{
	 int a=42;
	public Constructors1 ()
	  {
            System.out.println("pratik");
            System.out.println(a); 
	  }
	public void m1 ()
	{
		System.out.println("pratikpatil");
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
	Constructors1 ref=new Constructors1(); 
	ref.m1 ();
	ref.a=52;
	ref.m1();
	Constructors1 ref1=new Constructors1();
	ref1.a=52;
	}	
}	
	
	
	
	
	
	
	
	