/* Your heading */

import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class WordHeapTester
{
	public static int NUM_WORDS = 20; // increase this number to include more words
	
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(new File("UnorderedWords.txt"));
		
		WordHeap dictionary = new WordHeap();
		
		// Adds the words from the file to the WordHeap
		for(int i = 0; i < NUM_WORDS; i++)
			dictionary.add(in.next());
		in.close();
		
		// utilizes the WordHeap toString which should return each word and
		// its number of vowels in a single line in the order of the ArrayList
		System.out.println("Heap order:\n" + dictionary); 
		
		// next should print the words with the highest number of vowels first
		System.out.println ("*************\n\nRemoval order:");
		
		//for(int i = 0; i < NUM_WORDS; i++)
			//System.out.println(dictionary.remove());
		
		// This next section will utilize your heap sort.  An ArrayList is
		// created which contains the words in their original order.
		// Then, a WordHeap is created with the ArrayList.  The heap sort
		// sorts them.
		/*
		System.out.println ("\n*************\n\nAlphabetical order:");
		
		ArrayList<Word> unordered = new ArrayList<Word>();
		in = new Scanner(new File("UnorderedWords.txt"));
		for(int i = 0; i < NUM_WORDS; i++)
			unordered.add(new Word(in.next()));
		in.close();
		
		WordHeap sorted = new WordHeap(unordered);
		sorted.heapSort();
		System.out.println (sorted);
		*/		
	}
	

}