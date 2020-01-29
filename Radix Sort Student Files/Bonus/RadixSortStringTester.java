/**
*  RadixSortStringTester.java
*  Tests the RadixSortString class
*/

import java.util.*;
import java.io.*;

public class RadixSortStringTester
{
	public static final int NUM_WORDS = 1000;
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(new File("UnorderedWords.txt"));
		
		String[] words = new String[NUM_WORDS];
		for (int k = 0; k < words.length; k++)
			words[k] = in.nextLine();
		System.out.println("Before sorting: " + Arrays.toString(words) + "\n");
	
		RadixSortString.sort(words);
		System.out.println("After sorting: " + Arrays.toString(words) + "\n");

	}
}