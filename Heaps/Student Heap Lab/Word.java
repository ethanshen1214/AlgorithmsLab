/**
 * Ethan Shen
 * Gallatin 1
 * 2018/4/19
 */


public class Word 
{
	private String word;
	
	
    public Word(String w) 
    {
    	word = w;
    }
    
    public int getNumVowels()
    {
    	String temp = word;
    	temp.replaceAll("aeiou", "");
    	return word.length()-temp.length();
    }
    
    public String getWord()
    {
    	return word;
    }
    
    public int compareTo(Object o)
    {
    	Word temp = (Word)o;
    	return temp.getNumVowels()-this.getNumVowels();
    }
    
    public String toString()
    {
    	return String.format("%s: %d", word, this.getNumVowels());
    }
    
}