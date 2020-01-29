/**
 * Ethan Shen
 * Gallatin 1
 * 2018/4/30
 */

import java.util.ArrayList;

public class WordHash 
{
	private WordNode[] list;
	
	/**
	 * Constructs a hash table of words
	 * @param size the size of the array
	 */
    public WordHash(int size) 
    {
    	list = new WordNode[size];
    }
    
    /**
     * Adds a word to the front of the array
     * @param word the word to add
     */
    public void add(Word word)
    {
    	int index = word.hashCode();
    	WordNode thing = new WordNode(word, list[index]);
    	
    	list[index] = thing;
    }
    
    /**
     * Removes a given word
     * @param word the word to remove
     * @return whether the word is in the list
     */
    public boolean remove(Word word)
    {
    	WordNode thing = new WordNode(word, null);
    	int index = word.hashCode();
    	
    	if(list[index] == null)
    	{
    		return false;
    	}
    	else if(list[index].equals(thing))
    	{
    		list[index] = null;
    		return true;
    	}
    	else
    	{
    		WordNode temp = list[index];
    		
    		while(temp.getNext() != null)
    		{
    			if (temp.getNext().getWord().equals(thing))
	 			{
	 				temp.setNext(temp.getNext().getNext());
	 				return true;
	 			}
    			temp = temp.getNext();
    		}
    	}
    	return false;
    }
    
    /**
     * finds the word in the list
     * @param word the word to find
     * @return the index
     */
    public int find(Word word)
    {
    	return word.hashCode()+1;
    }
    
    /**
     * returns the string version of the hash
     * @return the string version of the hash
     */
    public String toString()
    {
    	String ret = "";
    	int index = 0;
    	for(WordNode node : list)
    	{
    		index++;
    		WordNode temp = node;
    		while(temp != null)
	 		{
	 			ret += index + " ";
	 			ret += temp.getWord() + "\n";
	 			temp = temp.getNext();
	 		}
    	}
	 	
	 	return ret;
    }
}