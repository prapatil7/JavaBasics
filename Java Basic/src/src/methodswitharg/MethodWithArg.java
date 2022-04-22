package methodswitharg;

public class MethodWithArg {
	
	public static boolean m1 (boolean a)
	{
		System.out.println(a);
		return true;
		
	}
	
	public char m2 (String s)
	{
		System.out.println(s);
		return 'j';
	}
	
public static void main(String[] args) {
	
	m1(true);
	MethodWithArg r=new MethodWithArg();
	char u =r.m2("yes");
	System.out.println(u + " yes");
			
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
