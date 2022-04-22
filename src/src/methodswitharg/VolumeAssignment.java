package methodswitharg;

public class VolumeAssignment {
	public int volume (int l, int b, int h)
	{
   int volume = l*b*h;
   return volume;
	}
	
public static void main(String[] args) {
	
	VolumeAssignment n=new VolumeAssignment();
	int vol1= n.volume(10, 20, 30);
	int vol2 = n.volume(12, 11,45);
	int vol3= n.volume(15,45,52);
	int volume= vol1+vol2+vol3;
	System.out.println(volume);
}
}
