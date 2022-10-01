package Strings;

import java.util.Scanner;

public class PrintOnlyUPPERCASECharacter_30 {

	public static void main(String[] args) {
/*Program to print only UPPER CASE Character*/
		String str="India78 is great8 Country8";
		for(int i=0;i<str.length();i++) {
			
			char c=str.charAt(i);
			
			if(Character.isUpperCase(c)) {
				System.out.println(c);
			}
			
		}
	}

}
