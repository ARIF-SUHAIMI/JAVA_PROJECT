package Ass1_Q3;
import java.util.Scanner;


public class Temperature
{
	double degrees;
	static double countTemp;
	
	Temperature()
	{
		degrees=0;
		countTemp++;
	}
	
	Temperature(double degrees)
	{
		this.degrees=degrees;
		countTemp++;
	}
	
	public double getDegree()
	{
		return degrees;
	}
	
	public void settDegree(double degrees)
	{
		this.degrees=degrees;
	}
	
	public String toString()
	{
		return degrees+" degree";
	}
	
	public boolean equals(double degrees)
	{
		if(this.degrees==degrees)
			return true;
		else
			return false;
	}
	
	public static double convertToCelcius(double d)
	{
		return ((d-32.0)*(5.0/9.0));
	}
	
	public static double convertToFahrenheit(double d)
	{
		return ((d*(9.0/5.0))+32.0);
	}
}