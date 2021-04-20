package Ass1_Q1;

import java.util.*;
import java.lang.Math;
public class suhu 
{
	private double T;
	private double t;
	
	suhu()
	{
		T=0.0;
		t=0.0;
		setTime();
	}
	
	private void setTime()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter time in hours : ");
		t=sc.nextDouble();
		calculateTemperature();
	}
	
	private void calculateTemperature()
	{
		T=((4*Math.pow(t,2))/(t+2))-20;
	}
	
	public double getTemperature()
	{
		return T;
	}
}
