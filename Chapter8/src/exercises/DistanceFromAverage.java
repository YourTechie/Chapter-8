package exercises;

import java.util.Scanner;

public class DistanceFromAverage 
{

	public static void main(String[] args) 
	{
		double total = 0;
		double avg = 0;
		double[] arrayNums = new double[20];
		Scanner input = new Scanner(System.in);
		int quit;
		int i = 0;
		
			
			while(quit != 99999)
			{
				i < arrayNums.length; i++; 
				System.out.println("Enter a number >>");
				arrayNums[i] = input.nextDouble();
				total = total + arrayNums[i];
			
			}
			System.out.println("Another number?? 99999 to quit");
			quit = input.nextInt();
			avg = total / arrayNums.length;
			
	}

}
