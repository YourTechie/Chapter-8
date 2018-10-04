package exercises;

public class TwelveInts 
{

	public static void main(String[] args) 
	{
		int[] numArrays = {1,2,3,4,5,6,7,8,9,10,11,12}; 
		System.out.println("Print the numbers first to last");
		int total = 0;
		String[] stringArray = {"This", "is ","a ","string ","array"};
		
		for(int i = 0; i < numArrays.length; i++)
		{
			System.out.println("Numbers in order " + numArrays[i]);
			total = total + numArrays[i];
		}
		for(int j = 11; j >= 0; j--)
		{
			System.out.println("Numbers in reverse order " +numArrays[j]);
		}
		System.out.println("Total: " + total);
		
		for(int z = 0; z<stringArray.length; z++)
		{
			System.out.println(stringArray[z]);
		}
	}
}
