package Strings;

import java.util.Scanner;

public class PrintEachWordsWhichHasSpecificLength_18 {
/* Print word which has only 5 characters*/
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
				if(w.length()==5)
					System.out.println(w);
				//System.out.println("No words found");
				w="";
		}
		
	
	}

}
}
