package Ass1_Q2;

import java.util.*;
public class Sum
{
	private double number;
	private double average;
	private double sum;
	private boolean condition=true;
	
	public Sum()
	{
		number=0;
		average=0;
		sum=0;
		input();
	}
	
	private void input()
	{
		Scanner sc=new Scanner(System.in);
		int i=0;
		String c="YES";
		
		while(c.equalsIgnoreCase("YES"))
		{
			i++;
			System.out.print("Please enter any value: ");
			number=sc.nextDouble();
			sum+=number;
			System.out.println("the sum of the number is "+sum);
			System.out.println();
			System.out.print("Do you want to perform the operation again? YES / NO : ");
			c=sc.next().toUpperCase();
			
			if(!(c.equalsIgnoreCase("NO")||c.equalsIgnoreCase("YES")))
			{
				System.out.println("WRONG INPUT");
				condition=false;
				break;
			}
			else
				condition=true;
		}
		calculateAvg(i);
	}
	
	private void calculateAvg(int in)
	{
		if(!condition)
			return;
		average=sum/in;
	}
	
	public double getSum()
	{
		return sum;
	}
	
	public double getAverage()
	{
		return average;
	}
}
