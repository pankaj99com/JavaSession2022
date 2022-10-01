package Strings;

import java.util.Scanner;

public class PrintStringWithDigitsAtFirstPlace_8 {

	public static void main(String[] args) {

		String str="India is great 24 Country";
		String d="";//create an empty string
		String r="";
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				d=d+ch;
			}else {
				r=r+ch;
			}
			
		}
		String s=d+r;
		System.out.println("New string with Digits at first place--->" +s);
	}

}
