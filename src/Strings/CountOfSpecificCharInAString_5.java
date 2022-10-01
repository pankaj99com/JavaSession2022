package Strings;

import java.util.Scanner;

public class CountOfSpecificCharInAString_5 {
/*Print count of specific chars in a String */
	public static void main(String[] args) {

		String str="India is great Country";
		int count=0;
		for(int i=0;i<str.length();i++) {
			
			char c=str.charAt(i);
			if(c=='a'|| c=='A') {
				count++;
				
			}	
			
		}
		
		System.out.println(" Total count of A:" +count);
	}

}
