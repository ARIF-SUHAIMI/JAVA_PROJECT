package Formula;

public class Division
{
	private double a=0;
	private double b=0;
	
	public Division(int a,int b)
	{
		this.a=a;
	}
	
	public Division()
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

	public double getDividAB()
	{
		return a/b;
	}
	
	public double getDividBA()
	{
		return b/a;
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
