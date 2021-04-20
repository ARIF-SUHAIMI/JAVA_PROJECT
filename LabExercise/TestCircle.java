package LabExercise;
import java.util.Scanner;

public class TestCircle
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		double rad=0;
		Circle [] circArr=new Circle[5];
		for(int i=0;i<circArr.length;i++)
		{
			circArr[i]=new Circle();
			System.out.print("Enter input :");
			rad=sc.nextInt();
			circArr[i].setRadius(rad);
		}
		
		for(int i=0;i<circArr.length;i++)
		{
			circArr[i].displayInfo();
		}
	}

}
