package mockgroup9;

public class VariableNonStatic {
	boolean b = true;
	public static void main(String[] args) 
	{
		VariableNonStatic n = new VariableNonStatic();
		System.out.println(n.b);
		System.out.println(VariableStatic.a);
		System.out.println(VariableStatic2.s);
	}

}
