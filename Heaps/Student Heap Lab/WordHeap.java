/**
 * Ethan Shen
 * Gallatin 1
 * 2018/4/19
 */

import java.util.*;

public class WordHeap 
{
	private ArrayList list;
	
    public WordHeap() 
    {
    	list = new ArrayList();
    }
    
    public void add(String word)
    {
    	list.add(word);
    	if(word.compareTo((String)list.get((list.size()-1) / 2)) > 0)
    	{
    		Word temp = word;
    		list.set(list.size()-1, list.get((list.size()-1) / 2));
    		list.set((list.size()-1) / 2, temp);
    	}
    }
    
    public String remove(String word)
    {
    	String remove = (String)list.get(0);
    	list.set(0, list.get(list.length-1));
    	int parent = 0;
    	int leftChild = parent*2 + 1;
    	int rightChild = parent*2 + 2;
    	
    	while(list.get(leftChild) != null && (list.get(parent).compareTo(list.get(leftChild)) < 0 || list.get(parent).compareTo(list.get(rightChild)) < 0))
    	{
    		if(list.get(rightChild) != null)
    		{
    			
    		}
    	}
    	
    	return remove;
    }
    
    public void heapSort()
    {
    	
    }
    
    public String toString()
    {
    	return "";
    }
}