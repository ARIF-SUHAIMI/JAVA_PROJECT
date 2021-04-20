package Presentation;

public class Garbage
{
	protected void finalize()	//destructor kalau c++ lepas hujung
	{
		System.out.println("Object is garbage collected");
	}
	
	public static void main(String[]args)
	{
		Garbage g1=new Garbage();
		System.out.println("G1");
		Garbage g2=new Garbage();
		System.out.println("G2");
		
		g1=g2;
		g2=null;
		
		System.gc();				//perform cleanup
	}
	
}