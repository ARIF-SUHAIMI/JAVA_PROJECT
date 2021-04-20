package Formula;

public class Multiplication
{
	private double a=0;
	private double b=0;
	
	public Multiplication(int a,int b)
	{
		this.a=a;
	}
	
	public Multiplication()
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

	public double getMultiplydAB()
	{
		return a*b;
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
