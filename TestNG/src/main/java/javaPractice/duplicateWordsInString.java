package javaPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class duplicateWordsInString {
	// Write a java program to find the duplicate words and their number of
	// occurrences in a string?

	public static void main(String[] args) {
		String inputString = "java selenium appium java selenium ruby phython";
		String[] words = inputString.split(" ");
		HashMap<String, Integer> countOfWords = new HashMap<String, Integer>();
		for (String word : words) {
			if (countOfWords.containsKey(word)) {
				countOfWords.put(word, countOfWords.get(word) + 1);
			} else {
				countOfWords.put(word, 1);
			}
			
		}
		System.out.println(countOfWords);
		Set<String> wordsInString=new HashSet<String>();
		
		wordsInString=  countOfWords.keySet();
		for(String count:wordsInString) {
			if(countOfWords.get(count)>1) {
				System.out.println(count+" : "+countOfWords.get(count));
				
			}
			
			
		}
	}

}
