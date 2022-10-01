package Strings;

import java.util.Scanner;

public class TotalNoOfVowelsInAString_6 {
/*PRINT TOTAL NO. OF VOWELS IN A STRING*/
	public static void main(String[] args) {

		String str="India is great Country";
		int count=0;
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			char c=Character.toUpperCase(ch);
			if(c=='A'|| c=='E' || c=='I' || c=='O' || c=='U') {
				count++;
				
			}	
			
		}
		
		System.out.println(" Total count of vowels:" +count);
	}

}
