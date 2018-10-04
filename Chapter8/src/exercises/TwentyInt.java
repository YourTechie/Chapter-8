package exercises;

import java.util.Scanner;

public class TwentyInt 
{

	public static void main(String[] args) 
	{
		double total = 0;
		double avg = 0;
		
		double[] arrayNums = new double[20];
		Scanner input = new Scanner(System.in);
		
		
			for(int i = 0; i < arrayNums.length; i++)
			{
				System.out.println("Enter a number >>");
				arrayNums[i] = input.nextDouble();
				total = total + arrayNums[i];
			
			}
		
	}

}
