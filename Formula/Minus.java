package Formula;

public class Minus 
{
	private double a=0;
	private double b=0;
	
	public Minus(int a,int b)
	{
		this.a=a;
	}
	
	public Minus()
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

	public double getMinusAB()
	{
		return a-b;
	}
	
	public double getMinusBA()
	{
		return b-a;
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
