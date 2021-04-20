package Presentation;

public class Wrapper
{
	public static void main(String[]args)
	{
		int a=20;						//primitive
		Integer i=Integer.valueOf(a);	//convert primitive to object
		Integer j=a;					//autoboxing
		System.out.println(a+"\n"+i+"\n"+j);
		
		
		/*Integer f=new Integer(3);		//object
		int u=f.intValue();				//convert object to primitive
		int h=f;						//unboxing
		System.out.println(f+" "+u+" "+h);*/
	}
}
