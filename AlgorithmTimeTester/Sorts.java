
// algorithmTester.java
// This program tests the efficiency of algorithms.


import java.util.*;

/**
 * A class containing the following sorting algorithms:
Dumb bubble
Smart bubble
Selection
Insertion
MergeSort (and Merge)
Quicksort // will learn later and add
Heap Sort // will learn later and add
Radix 

 */
public class Sorts
{
	/**
	 * Basic bubble sort
	 */
	public static void bubbleSort(int[] list)
	{
		int temp;
		for(int i = 1; i < list.length; i++)
		{
			for(int x = 0; x < list.length-i; x++)
			{
				if(list[x] > list[x+1])
				{
					temp = list[x];
					list[x] = list[x+1];
					list[x+1] = temp;
				}
			}
		}
	}
	
	/**
	 * Bubble sort with a function that checks if it's done at the end of each loop
	 */
	public static void smartBubbleSort(int[] list)
	{
		int temp;
		boolean done = false;
		int count = 1;
		while(!done)
		{
			done = true;
			for(int x = 0; x < list.length-count; x++)
			{
				if(list[x] > list[x+1])
				{
					done = false;
					temp = list[x];
					list[x] = list[x+1];
					list[x+1] = temp;
				}
			}
			count++;
		}
	}
	
	/**
	 * Chooses the highest number of each pass and switches it with the last unsorted position
	 */
	public static void selectionSort(int[] list)
	{
		int max = 0;
		int temp;
		for(int i = 1; i < list.length; i++)
		{
			max = 0;
			for(int x = 0; x <= list.length-i; x++)
			{
				if(list[x] > list[max])
				{
					max = x;
				}
			}
			temp = list[list.length-i];
			list[list.length-i] = list[max];
			list[max] = temp;
		}
	}
	
	/**
	 * Makes an increasingly larger sorted list
	 */
	public static void insertionSort(int[] list)
	{
		int temp;
		int count;
		for(int i = 1; i < list.length; i++)
		{
			temp = list[i];
			count = i;
			while(count > 0 && temp < list[count-1])
			{
				list[count] = list[count-1];
				count--;
			}
			list[count] = temp;
		}
	}

	/**
	 * Recursively sorts the left and right side of the list
	 */
	public static void mergeSort(int[] list, int first, int last)
	{
		int mid = (first + last)/2;
		if(first != last)
		{
			mergeSort(list, first, mid);
			merge(list, first, mid, mid+1, last);
			mergeSort(list, mid+1, last);
			merge(list, first, mid, mid+1, last);
		}
		
	}
	
	public static void merge(int[] list, int leftFirst, int leftLast, int rightFirst, int rightLast)
	{
		
	}

	/** 
	 * Sorts the given array using the Radix Sort - organizes by digit
	 * @param list the array of integers to be sorted
	 * Precondition: list.length > 0; all values in nums are nonnegative
	 */	
	public static void radixSort(int[] list)
	{
		RadixSort.sort(list);
	}
	
	public static void quickSort(int[] list, int first, int last)
	{
		int[] intArray = list;
		
		if (first < last)
		{
			int temp = 0;
			int pivotValue = intArray[first];
			int pivotIndex = first;
			
			for (int k = first+1; k <= last; k++)
			{
				if (intArray[k] <= pivotValue)
				{
					pivotIndex++;
					temp = intArray[k];
					intArray[k] = intArray[pivotIndex];
					intArray[pivotIndex] = temp;
				}
			}
			
			temp = intArray[pivotIndex];
			intArray[pivotIndex] = intArray[first];
			intArray[first] = temp;
			quickSort(intArray, first,pivotIndex-1);
			quickSort(intArray, pivotIndex+1,last);
		}
	}	
}


