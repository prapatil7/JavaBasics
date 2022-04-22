package revision;

public class MethodRtArg {
	
	public String m1 (String brand, String model, String price, String OS, String RAM, String ROM)
	{
		System.out.println(brand);
		System.out.println(model);
		System.out.println(price);
		System.out.println(OS);
		System.out.println(RAM);
		System.out.println(ROM);
		return "Parent Company = BBK Electronics";
		
	}
	public static void main(String[] args)
	{
		MethodRtArg n=new MethodRtArg();
		String rtvalue= n.m1("realme","realme 2", "35000","Oxygen", "8GB", "128GB");
	     System.out.println(rtvalue);
	    
	
	}
		

	}
