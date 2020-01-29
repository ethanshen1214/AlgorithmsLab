/**
 * Ethan Shen
 * Gallatin 1
 * 2018/4/30
 */

import java.util.ArrayList;
import java.io.*;
import java.util.*;

/**
 * Tests the WordHash class which manages a HashTable of Words
 */
public class WordHashTester
{
	public static int NUM_WORDS = 100; // 9991 max increase this number to include more words
	
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(new File("UnorderedWords.txt"));
		WordHash words = new WordHash(NUM_WORDS);
		for(int i = 0; i < NUM_WORDS; i++)
		{
			Word w = new Word(in.next());
			words.add(w);
		}
		in.close();
		
		System.out.println (words);
		
		Scanner input = new Scanner(System.in);
		String word;
		
		// test find
		
		do{
			System.out.print("Enter a word to find or Q to quit: ");
			word = input.next();
			if(!word.equalsIgnoreCase("q"))
			{
				Word search = new Word(word);
				int index = words.find(search);
				if(index != -1)
					System.out.println (search + " found at index " + index);
				else
					System.out.println (search + " not found");
			}
		}while (!word.equalsIgnoreCase("q"));
		
		
		// test remove
		
		 do{
			System.out.print("Enter a word to remove or Q to quit: ");
			word = input.next();
			if(!word.equalsIgnoreCase("q"))
			{
				if(words.remove(new Word(word)))
					System.out.println (word + " removed");
				else
					System.out.println (word + " not found");
				System.out.println (words);	
			}
		}while (!word.equalsIgnoreCase("q"));
		
		
	}
	

}