package Strings;

import java.util.Scanner;

public class PrintEachWordsWhichContainsSpecificAlphabet_17 {
/* Print word which contains letter 'i'*/
	public static void main(String[] args) {

		String str="India is great 24 Country";
		String w="";
		 str=str+" ";
	
		for(int i=0;i<str.length();i++) {
			
			char c=str.charAt(i);
			
			if(c!=' ') {
				w+=c;
			}
			else 
			{
				if(w.contains("i"))
					System.out.println(w);
				//System.out.println("No words found");
				w="";
		}
		
	
	}

}
}
