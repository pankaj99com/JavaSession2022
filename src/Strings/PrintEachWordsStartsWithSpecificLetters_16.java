package Strings;

import java.util.Scanner;

public class PrintEachWordsStartsWithSpecificLetters_16 {
/* Print word which starts with Co*/
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
				if(w.startsWith("Co"))
					System.out.println(w);
				
				w="";
		}
		
	
	}

}
}
