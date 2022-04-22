package mockgroup9;
public class Non_Static_Method {
 public void addition () 
 {
   int a = 30;
   int b = 20;
   int c = 10;
   
   int d = a + b + c;
   System.out.println(d);
   
  }
  
 public void substraction ()
 {
	 int a = 100;
	 int b = 40;
	 int c = 20;
	 
	 int d = a-b-c;
	 System.out.println(d);
 }

  
	  public void multiplication ()
 {
	  int p = 25;
	  int q = 1000;
	  
	  int r = p*q;
	  System.out.println("The multiplication of both no.s is " + r);
	  

}
 
  public void division ()
  {
	  int d = 2224;
	  int e = 42;
	  
	  int g= d/e;
	  
	  System.out.println("the division of both no.s is " + g);
	  
  }
  
  
 public static void main(String[] args)
 {
	Non_Static_Method s=new Non_Static_Method();
	s.addition ();
	s.substraction();
	s.multiplication();
	s.division();
	
	NonStaticMethod2 t=new NonStaticMethod2();
	t.myNameIs();
}
 
 
 
 
 
 
}
