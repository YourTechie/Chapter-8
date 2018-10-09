package exercises;
import java.util.Scanner;
public class ArrayMethodDemo 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int[] arrayNums = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		
		displayIntegers(arrayNums);
		reverseIntegers(arrayNums);
		sumIntegers(arrayNums, sum);
	}
	public static void displayIntegers(int[] arrayNums)
	{
		for(int i = 0; i < arrayNums.length; i++)
		{
			System.out.println("Numbers in order " + arrayNums[i]);
		}
	}	
	public static void reverseIntegers(int[] arrayNums)
	{
		for(int j = 9; j >= 0; j--)
		{
			System.out.println("Numbers in reverse order " +arrayNums[j]);
		}
	}
	public static void sumIntegers(int[] arrayNums, int sum)
	{
		sum = (sum + arrayNums);
		System.out.println("Sum of the numbers are "+ sum);
	}
}	