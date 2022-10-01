package Strings;

import java.util.Scanner;

public class ReversingEachWordInAString_12 {
/*Print String after reversing each word*/
	public static void main(String[] args) {

		String str="India is great 24 Country";
		String reverse="";//create an empty string
	
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			reverse=ch+reverse;
			

		}
		
		System.out.println("New string after reversing each word--->" +reverse);
	}

}
