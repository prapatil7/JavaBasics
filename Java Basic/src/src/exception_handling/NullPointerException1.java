package exception_handling;

public class NullPointerException1 {
	
	int a= 5;
		NullPointerException1 n;      // we just created the reference variable and not defined the object
		                              // so that default value of any variable is null and which will be considered here
		                              // and as we're using this reference variable to initiate the non static variables this means 
		                              // this means we are initiating on the basis of null value hence it is Null Pointer Exception 
		public void m1 ()
		{
		try
		{
			System.out.println(n.a);
		}
		catch(NullPointerException npe)
		{
			System.out.println("Null pointer exception has been arrived");
		}
		}
		
		public static void main(String[] args) {
			
			NullPointerException1 n1=new NullPointerException1();
			   n1.m1();
	}
}

