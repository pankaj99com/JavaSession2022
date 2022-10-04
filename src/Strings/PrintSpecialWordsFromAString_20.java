package Strings;

import java.util.Scanner;

public class PrintSpecialWordsFromAString_20 {
/* Print special  word like MOM,DAD,*/
	public static void main(String[] args) {

		String str="India is great 24 Country mom";
		String w="";
		 str=str+" ";
	
		for(int i=0;i<str.length();i++) {
			
			char c=str.charAt(i);
			
			if(c!=' ') {
				w+=c;
			}
			else 
			{
				char first=w.charAt(0);
				char last=w.charAt(w.length()-1);
				
				if((Character.toUpperCase(first)) ==(Character.toUpperCase(last))) {
					System.out.println(w);
				}
				w="";
		}
		
	
	}

}
}
