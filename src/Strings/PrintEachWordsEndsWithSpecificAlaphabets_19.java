package Strings;

import java.util.Scanner;

public class PrintEachWordsEndsWithSpecificAlaphabets_19 {
/* Print word which endss with ia*/
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
				if(w.endsWith("ia"))
					System.out.println(w);
				//System.out.println("No words found");
				w="";
		}
		
	
	}

}
}
