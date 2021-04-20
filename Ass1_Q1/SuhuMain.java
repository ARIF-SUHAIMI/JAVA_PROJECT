package Ass1_Q1;

import Ass1_Q2.*;
public class SuhuMain
{
	public static void main(String[]args)
	{
		Sum s11=new Sum();
		suhu s1=new suhu();
		System.out.println("Freezer temperature = "+s1.getTemperature()+" Degree Celcius");
		System.out.println("This is average from assignment 2: " +s11.getAverage());
	}
}