package revision;

public class LeapYear {
   
	 public LeapYear(int year) 
	 {
       if (year%400==0 || year%4==0 && year%100==0)
       {
		   System.out.println("it is leap year");
	   }
	   else
	   {
		   System.out.println("it is not leap year");
	   }
   }
	 
	  public static void main(String[] args)
	  {
		  LeapYear n=new LeapYear(2014);
	  }
	
   }

