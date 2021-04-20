package Formula;

public class Addition
{
	private double a=0;
	private double b=0;
	
	public Addition(int a,int b)
	{
		this.a=a;
	}
	
	public Addition()
	{
		
	}
	
	public void setA(int a)
	{
		this.a=a;
	}
	
	public void setB(int b)
	{
		this.b=b;
	}

	public double getAdd()
	{
		return a+b;
	}
	
	public double getA()
	{
		return a;
	}
	
	public double getB()
	{
		return b;
	}
}
