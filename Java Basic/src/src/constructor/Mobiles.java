package constructor;

public class Mobiles {
	static String mobile = "realme";
	String colour;
	
	public Mobiles ()
	{
		System.out.println("parent company= BBK electonics");
	}
	
  public Mobiles (String model, String price, String os, String RAM, String ROM)
  {
	  this();
	  System.out.println(mobile);
	  System.out.println(model);
	  System.out.println(this.colour="black");
	  System.out.println(price);
	  System.out.println(os);
	  System.out.println(RAM);
	  System.out.println(ROM);
  }
	
    public static void main(String[] args) 
    {
	 Mobiles p=new Mobiles("realme 2", "8000", "coloros 9.0" , "2GB", "32GB");
	 Mobiles p1=new Mobiles("realme 2pro", "12000", "coloros 9.1" , "3GB", "64GB");
	 Mobiles p3=new Mobiles("realme 3", "15000", "coloros 9.2" , "4GB", "64GB");
	 Mobiles p4=new Mobiles("realme 5", "15500", "coloros 10" , "4GB", "128GB");
	 Mobiles p5=new Mobiles("realme narzo", "17000", "coloros 11" , "6GB", "128GB");
	 Mobiles p6=new Mobiles("realme narzo 2 ", "19000", "coloros 11" , "6GB", "128GB");
	}
	
	
	
	
	

}
