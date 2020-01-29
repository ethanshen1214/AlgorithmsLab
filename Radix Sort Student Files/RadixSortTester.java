/*
 * Ethan Shen
 * Gallatin 1
 * 2018/04/18
 */



import java.util.Arrays;

/**
*  RadixSortTester.java
*  Tests the RadixSort class
*/
public class RadixSortTester
{
	public static void main(String[] args) 
	{
		//*** Set 1
		int[] numbers = new int[25];
		for (int k = 0; k < numbers.length; k++)
			numbers[k] = (int) (Math.random() * 100000) + 1;
		System.out.println("Before sorting: " + Arrays.toString(numbers) + "\n");
	
		RadixSort.sort(numbers);
		System.out.println("After sorting: " + Arrays.toString(numbers) + "\n");
		
		//*** Set 2
		numbers = new int[50];
		for (int k = 0; k < numbers.length; k++)
			numbers[k] = (int) (Math.random() * 20) + 1;
		System.out.println("Before sorting: " + Arrays.toString(numbers) + "\n");
	
		RadixSort.sort(numbers);
		System.out.println("After sorting: " + Arrays.toString(numbers) + "\n");

	}
}