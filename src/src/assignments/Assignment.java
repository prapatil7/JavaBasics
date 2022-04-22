package assignments;

public class Assignment 
{
   String studensname;
   int mathsmarks;
   int physicsmarks;
   int chemistrymarks;
   static String collegename = "zeal college of engineering, pune";
   static char section ='A';
   
  
  public static void pratik() {
	Assignment n1=new Assignment();
		 
	       System.out.println(n1.studensname="pratik");
		   System.out.println(n1.mathsmarks=70);
		   System.out.println(n1.physicsmarks=80);
		   System.out.println(n1.chemistrymarks=77);
		   System.out.println(collegename);
			  System.out.println(section);
  }
  
		public static void shivam  () 
		{
			Assignment n2=new Assignment();
			System.out.println(n2.studensname="shivam");
			System.out.println(n2.mathsmarks=70);
			System.out.println(n2.physicsmarks=80);
			System.out.println(n2.chemistrymarks=75);
			System.out.println(collegename);
			  System.out.println(section);
		}
		
		   
		public static void prabha () 
		{
			Assignment n3=new Assignment();
		    System.out.println(n3.studensname="prabha");
		    System.out.println(n3.mathsmarks=72);
		    System.out.println(n3.physicsmarks=82);
		    System.out.println(n3.chemistrymarks=75);
		    System.out.println(collegename);
			  System.out.println(section);
		}
    
	   
	   public static void main(String[] args)
	 {
		
		  
		  pratik();
		  shivam();
		  prabha();
		  
	 }  
		   
	
}  
   
   
   
   
