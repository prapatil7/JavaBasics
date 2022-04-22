package casting;

public class NonPrimitiveCasting {
	// primitive 
	// 1. implicit casting
	public static void main(String[] args) {
		
		byte a= 10;
		int b=(int)a;
		System.out.println(b);
		
		short d= 20;
		long c=(long)d;
		System.out.println(c);
		
		// 2. explicit casting
		
		int e=135;
	    byte f=(byte)e;
	    System.out.println(f);    //135-127=8;; -128-7=-121
	    
	    short g=140;
	    byte h= (byte)g;
	    System.out.println(h);
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
