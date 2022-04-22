package oops_inheritance;

public class WAChild1 extends WhatsAppGrandfather
{
	public static void audioCalling ()
	{
		System.out.println("audio calling");
	}
  
	public void videoCalling (String s)
	{
		System.out.println(s);
	}
	
	
	public static void main(String[] args) 
	{
		WAChild1 n=new WAChild1();
		n.audioCalling();
		n.videoCalling("video calling");
		n.sms();
		story();
				
	}
}