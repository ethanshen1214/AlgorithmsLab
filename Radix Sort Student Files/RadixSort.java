/*
 * Ethan Shen
 * Gallatin 1
 * 2018/04/18
 */

import java.util.Queue;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * A class to perform a Radix Sort on an array of integers
 */
public class RadixSort 
{
	/** 
	 * Sorts the given array using the Radix Sort
	 * @param nums the array of integers to be sorted
	 * Precondition: nums.length > 0; all values in nums are nonnegative
	 */
	public static void sort(int[] nums) 
	{
		int numDigits = getMaxDigits(nums);
		
		for (int k = 0; k < numDigits; k++) 
		{
			List<Queue<Integer>> qs = itemsToQueues(nums, k);
			queuesToArray(qs, nums);
		}
	}
	
	/**
	 * Returns the maximum number of digits of any value in the array.
	 * @param numbers the array of integers
	 * @return the maximum number of digits of any value in the array.
	 */
	private static int getMaxDigits(int[] numbers)
	{
		int max = 0;
		for(int num : numbers)
			max = (int)Math.ceil(Math.log10(num));
		return max;
	}
	
	/**
	 * Returns the digit at location k in the given integer.  The least significant
	 * digit is indicated by a value of 0 for k.  If k is greater than the nth number
	 * of digits in the given integer, getDigit returns 0.  
	 * @param number the number to evaluate
	 * @param k the location in number to evaluate
	 * @return the digit at location k in number
	 */
	private static int getDigit(int number, int k) 
	{
		int digit = 0;
		digit = (int)Math.floor((number/Math.pow(10, k)) % 10);
		return digit;
	}
	
	/**
	 * Creates the intermediate array list of ten queues.  Each integer in the given
	 * array is inserted into the queue corresponding to the value of the
	 * digit currently being examined.  If an integer does not have a digit at the
	 * given place value, 0 is assumed for that placed value.
	 * @param nums the array of integers
	 * @param k the position of the digit being examined
	 * @return the list of queues
	 */
	private static List<Queue<Integer>> itemsToQueues(int[] nums, int k) 
	{
		List <Queue<Integer>> queueList = new ArrayList<Queue<Integer>>();
		for(int i = 0; i < 10; i++)
		{
			queueList.add(new LinkedList<Integer>());
		}
		
		for(int num : nums)
		{
			int digit = RadixSort.getDigit(num, k);
			queueList.get(digit).add(num);
		}
		return queueList;
	}
	
	/**
	 * Repopulates the given array from the given array of queues
	 * @param queues the ArrayList of queues
	 * @param nums the integer array to repopulate
	 */
	private static void queuesToArray(List<Queue<Integer>> queues, int[] nums) 
	{
		int count = 0;
		for(Queue queue : queues)
		{
			while(queue.peek() != null)
			{
				nums[count] = (int)queue.remove();
				count++;
			}
		}
	}

}