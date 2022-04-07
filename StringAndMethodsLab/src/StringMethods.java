
/**
 * StringMethods contains all string manipulation methods for lab 2.5.
 * 
 * @author Tim Fierek
 *
 */
public class StringMethods {

	/**
	 * capitalizes the first letter of the string and makes all others lower case
	 * 
	 * @param word word or phrase to be capitalized
	 * @return return the manipulated word
	 */
	public static String capitalize(String word) {
		
		if(word.length() < 2) {			
			if(word.length() == 0) {		//check if word is empty
				return word;
			}
			else {							//word has a single character
				return word.toUpperCase();
			}
		}
		else {
			String result = "";
			result += word.substring(0,1).toUpperCase();
			result += word.substring(1).toLowerCase();
			return result;
		}
		
	}	
	
	/**
	 * finds the first index of the substring "waldo"
	 * 
	 * @param phrase the phrase to be searched in
	 * @return return the index of "waldo" in the form of a string or and error message if "waldo" not found
	 */
	public static String wheresWaldo(String phrase) {
		int location = phrase.toLowerCase().indexOf("waldo");
		if(location == -1) {
			return "Error: waldo not found";
		}
		
		return location + "";
	}
	
	/**
	 * arranges two strings in alphabetical order
	 * 
	 * @param a first word or phrase
	 * @param b second word or phrase
	 * @return return the two strings in alphabetical order condensed into a single string
	 */
	public static String firstThingsFirst(String a, String b) {
		if(a.toLowerCase().compareTo(b.toLowerCase()) < 0) {
			return a + " " + b;
		}
		else {
			return b + " " + a;
		}
	}
	
	/**
	 * changes a string character by character to it's reverse
	 * 
	 * @param s String to be reversed
	 * @return return s from back to front 
	 */
	public static String reverse(String s) {
		String result = "";
		for(int i = s.length() - 1; i > -1; i--) {
			result += s.charAt(i);
		}
		return result;
	}
	
	/**
	 * prints the longer of the two inputs
	 * 
	 * @param a String to be compared by length
	 * @param b String to be compared by length
	 */
	public static void soLong(String a, String b) {
		if(a.length() == b.length()) {
			System.out.print(a + " " + b);
			return;
		}
		else if(a.length() > b.length()) {
			System.out.print(a);
			return;
		}
		else {
			System.out.print(b);
		}
	}
	
	/**
	 * removes all characters before the first occurance of the word "math" in the input
	 * 
	 * @param phrase String to be checked for the word "math"
	 * @return a new string with everything preceding "math" removed, or ""math" not found"
	 */
	public static String afterMath(String phrase) {
		int index = (phrase.toLowerCase()).indexOf("math");
		
		if(index == -1) {
			return "\"math\" not found";
		}
		
		return phrase.substring(index);
	}
	
	/**
	 * prints out a string to the console, one character at a time
	 * 
	 * @param word String to be printed 1 character at a time
	 */
	public static void letterize(String word) {
		for(int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
	}
	
	/**
	 * creates a camelCase phrase from a passed String
	 * 
	 * @param word String to be converted to camelCase
	 */
	public static void camelCase(String word) {
		String[] separateWords = word.split(" ");
		String result = separateWords[0];
		
		for(int i = 1; i < separateWords.length; i++) {
			String cur = separateWords[i];
			if(cur.length() == 1) {
				result += cur.toUpperCase();
			}
			else {
				result += (cur.substring(0,1).toUpperCase());
				result += (cur.substring(1).toLowerCase());
			}
		}
		System.out.print(result);
	}
}
