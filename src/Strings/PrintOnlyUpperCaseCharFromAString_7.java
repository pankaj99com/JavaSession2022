package Strings;

import java.util.Scanner;

public class PrintOnlyUpperCaseCharFromAString_7 {
/*Print only Uppercase character from a String*/
	public static void main(String[] args) {

		String str="India is great Country";
		String s="";//create an empty string
		for(int i=0;i<str.length();i++) {
			
			char c=str.charAt(i);
			if(Character.isUpperCase(c)) {
				//System.out.print(c);
				s=s+c;
			}
			
		}
		
		System.out.println("New string with only upper case--->" +s);
	}

}
