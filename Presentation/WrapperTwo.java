package Presentation;

public class WrapperTwo
{
	public static void main(String[]args)
	{
		rapclass c1=new rapclass(32);
		System.out.println(c1);
	}
}


class rapclass
{
	private int h;
	
	rapclass(int h)
	{
		this.h=h;
	}
	
	public void setInt(int h)
	{
		this.h=h;
	}
	
	public int getInt()
	{
		return h;
	}
	
	public String toString()
	{
		return Integer.toString(h);
	}
}