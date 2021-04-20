package LabExercise;
import java.lang.Math;

public class Circle
{
	private double radius;
	
	public void setRadius(double r)
	{
		radius=r;
	}
	
	public double getradius()
	{
		return radius;
	}
	
	public double calcPerimeter()
	{
		double perimeter;
		perimeter=2*Math.PI*radius;
		return perimeter;
	}
	
	public void displayInfo()
	{
		System.out.println("Radius : "+radius);
		System.out.println("Perimeter : "+calcPerimeter());
	}
}
