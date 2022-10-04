package Strings;

import java.util.Scanner;

public class PrintCountOfUpperCaseCharInAString_4 {
/* Total count of upper case chararcters*/
	public static void main(String[] args) {

		String str="INDIA is great Country";
		int count=0;
		for(int i=0;i<str.length();i++) {
			
			char c=str.charAt(i);
			if(Character.isUpperCase(c)) {
				count++;
				System.out.println(c);
			}	
			
		}
		
		System.out.println(" Total count of upper case chararcters are:" +count);
	}

}
