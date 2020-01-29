/**
 * Ethan Shen
 * Gallatin 1
 * 2018/4/30
 */


public class WordNode 
{
	private Word word;
	private WordNode next;
	
	/**
	 * Constructs a word node
	 * @param w the word
	 * @param n the next node
	 */
    public WordNode(Word w, WordNode n) 
    {
    	word = w;
    	next = n;
    }
    
    /**
     * returns the word
     * @return the word
     */
    public Word getWord()
    {
    	return word;
    }
    
    /**
     * returns the next node
     * @return the next node
     */
    public WordNode getNext()
    {
    	return next;
    }
   	
   	/**
   	 * sets the next node
   	 * @param thing the next node to set
   	 */
   	public void setNext(WordNode thing)
   	{
   		next = thing;
   	}
   	
   	/**
   	 * sets the word
   	 * @param thing the word to set
   	 */
   	public void setWord(Word thing)
   	{
   		word = thing;
   	}
    
    
}