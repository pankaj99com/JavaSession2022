package Strings;

import java.util.Scanner;

public class PrintStringAfterRemovingSpaces_10 {
/*Print string after removing spaces*/
	public static void main(String[] args) {

		String str="India is great 24 Country";
		String d="";//create an empty string
	
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			if(!Character.isWhitespace(ch)) {
				d=d+ch;
			
			}
			
		}
		
		System.out.println("New string after removing spaces--->" +d);
	}

}
