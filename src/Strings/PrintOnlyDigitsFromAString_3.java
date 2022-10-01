package Strings;

import java.util.Scanner;

public class PrintOnlyDigitsFromAString_3 {

	public static void main(String[] args) {
/*Program to print only Digits in Character*/
		String str="India78 is great8 Country8";
		for(int i=0;i<str.length();i++) {
			
			char c=str.charAt(i);
			
			if(Character.isDigit(c)) {
				System.out.println(c);
			}
		}
	}

}
