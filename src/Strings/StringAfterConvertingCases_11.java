package Strings;

import java.util.Scanner;

public class StringAfterConvertingCases_11 {
/*Print string after converting all words to uppercase and viceversa*/
	public static void main(String[] args) {

		String str="India is great 24 Country";
		String d="";//create an empty string
	
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			if(Character.isLowerCase(ch)) 
				d=d+Character.toUpperCase(ch);
			
			else 
				d=d+Character.toLowerCase(ch);
			
			
		}
		
		System.out.println("Newstring after converting the case--->" +d);
	}

}
