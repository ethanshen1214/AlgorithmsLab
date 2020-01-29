/**
 * Ethan Shen
 * Gallatin 1
 * 2018/4/30
 */


public class Word 
{
	private String word;
	
	/**
	 * Constructs a string word
	 * @param w the word
	 */
    public Word(String w) 
    {
    	word = w;
    }
    
    /**
     * Returns the word
     * @return the word
     */
    public String getWord()
    {
    	return word;
    }
    
    /**
     * checks if two words are equal
     * @param o the object to check
     * @return whether they are equal
     */
    public boolean equals(Object o)
    {
    	Word temp = (Word) o;
    	return (word.hashCode() == temp.hashCode());
    }
    
    /**
     * finds a hash index for the word
     * @return the index
     */
    public int hashCode()
    {
    	int sum = 0;
    	for(int i = 0; i < word.length(); i++)
    	{
    		sum = sum + word.charAt(i);
    	}
    	return (sum%word.charAt(0))%WordHashTester.NUM_WORDS;
    }
    
    /**
     * returns the string version of the word
     * @return the string version of the word
     */
    public String toString()
    {
    	return word;
    }
    
}