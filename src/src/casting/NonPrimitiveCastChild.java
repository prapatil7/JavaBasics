package casting;

public class NonPrimitiveCastChild extends NonPrimitiveCast {
	
		// up casting 
		public void m1 ()
		{
			System.out.println("m1 method from child");

		}
		
		public void m4()
		{
			System.out.println("m4 method from child");
		}
		
		
		public static void main(String[] args)
		{
		   NonPrimitiveCastChild npc=new NonPrimitiveCastChild();
		  NonPrimitiveCast npp = (NonPrimitiveCast)npc;
			npp.m1();
			npp.m2();
			npc.m4();
			npc.m1();
			System.out.println();
			
			// down casting 
		  NonPrimitiveCastChild npc1= (NonPrimitiveCastChild)npp;
			
			npc1.m1();
			npc1.m2();
			npc1.m4();
			npp.m1();
			
			
		}	
	}

