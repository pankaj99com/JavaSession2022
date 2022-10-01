package Strings;

import java.util.Scanner;

public class PrintASCIIOfEachCharInAString_2 {

	public static void main(String[] args) {
/*Print ASCII values of each alphabetc appearing in a String*/
		String str="India is great Country";
		for(int i=0;i<str.length();i++) {
			
			char c=str.charAt(i);
			System.out.println(c+" "+(int)c);//print string
			
		
			
			
		}
	}

}
