package Ass1_Q3;
import java.util.Scanner;
import Ass1_Q3.Temperature;

public class TemperatureMain
{
	public static void main(String[]args)
	{
		Temperature t1=new Temperature();					//Object for temperature 1
		Temperature t2=new Temperature();					//OBject for temperature 2
		Scanner sc=new Scanner(System.in);	
		double temp;
		
		
		System.out.print("Please enter temperature 1: ");	//user prompt for input temperature 1
		temp=sc.nextDouble();								//user input
		t1.settDegree(temp);								//call mutator
		optConvert(t1);										//user define method to choose Convertion Option F->C or C->F
		System.out.println();
		System.out.print("Please enter temperature 2: ");	//user prompt for input temperature 2
		temp=sc.nextDouble();								//user input
		t2.settDegree(temp);								//call mutator
		optConvert(t2);										//user define method to choose Convertion Option F->C or C->F
		System.out.println();
		
		if(t1.equals(t2.getDegree()))						//Calling equal() method
			System.out.println("Both degree are equal");
		else
			System.out.println("Both degree are not equal");
	}
	
	static void optConvert(Temperature t)
	{
		Scanner sc=new Scanner(System.in);
		int choice=0;
		System.out.print("Choose 1 for degree F to degree C , 2 for degree C to degree F: ");
		choice=sc.nextInt();
		if(choice==1)
		{
			System.out.print(t+" fahrenheit convert to degree celcius is ");
			System.out.println(Temperature.convertToCelcius(t.getDegree()));
		}
		
		else if(choice==2)
		{
			System.out.print(t+" celcius convert to degree fahrenheit is ");
			System.out.println(Temperature.convertToFahrenheit(t.getDegree()));
		}
		
		else
			System.out.println("WRONG INPUT");
	}
}