package constructor;

public class StudentsInfoAssignment {

     String studentsname;
    static String collegename = "Zeal College of engineering snd resrearch pune";
    static char division= 'A';
     int mathsmarks;
     int phymarks;
     int chemmarks;
     
     public StudentsInfoAssignment (String a, int b, int c, int d)
     
     {
    	 String studentsname= a;
    	 int mathsmarks = b;
    	 int phymarks = c;
    	 int chemmarks = d;
    	 System.out.println(a);
    	 System.out.println(b);
    	 System.out.println(c);
    	 System.out.println(d);
    	 
    	 System.out.println(collegename);
    	 System.out.println(division);
    	 
    	 
     }
     
     
     
     public static void main(String[] args) {
    
    	StudentsInfoAssignment k=new StudentsInfoAssignment("abc",'A',78,82);
    	
    	
    	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
