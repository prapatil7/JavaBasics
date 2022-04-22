package constructor; 
public class Constructors2 
{     
	// zero arguments
   public Constructors2 ()
   {
	   System.out.println("zero argument");
   }
   // one argument
   public Constructors2 (String a)
   {
	   this ();
	  System.out.println("one argument");
   }
   // two argument
   public Constructors2 (int a, boolean c)
   {
	   this ("pratikp");
	   System.out.println("two argument");
   }
   // this keyword is used to call the constructor into another constructor
   // this keyword can be used only one time to call constructor and is only be called on ;
   //first line of the another constructor. 
   public static void main(String[] args) 
   {
	Constructors2 n2=new Constructors2(456, false);
   }
}
