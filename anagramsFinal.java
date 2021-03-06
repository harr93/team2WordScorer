package day4;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class anagramsFinal {
	
	public String sortWord(String word) {
	        char[] chars = word.toCharArray();
	        Arrays.sort(chars);
	        return new String(chars);
	}

	
	public HashMap<String, String> getAnagramList() throws NumberFormatException, IOException {
		
		FileReader sowpods= new FileReader("C:/Users/test/Pictures/sowpods.txt");
		BufferedReader in=new BufferedReader(sowpods);
				
		String currentWord=in.readLine();
		HashMap<String, String> sowPodsList = new HashMap<String, String>();
		String sortedWord,value;
		while (currentWord!=null)
		{
			sortedWord=sortWord(currentWord);
			if(!sowPodsList.containsKey(sortedWord)){
				sowPodsList.put(sortedWord, currentWord);
			}
			else{
				value=sowPodsList.get(sortedWord);
				value=value+" "+currentWord;
				sowPodsList.put(sortedWord, value);
			}
			currentWord=in.readLine();
			
		}
		in.close();
		return sowPodsList;
	}
}
