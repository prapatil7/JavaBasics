package mockgroup9;

public class VariableStatic {

	static int a=654;
	public static void main(String[] args)
	
	{
		System.out.println(a);
		System.out.println(VariableStatic2.b);
		System.out.println(VariableStatic2.s);
		VariableNonStatic c=new VariableNonStatic();
		System.out.println(c.b);
	}
	
	
	
	}
	

