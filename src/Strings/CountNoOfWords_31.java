package Strings;

import java.util.Scanner;

public class CountNoOfWords_31 {
/*count number of words in a string*/
	public static void main(String[] args) {

		String str="India is great 24 Country";
		int count=1;
	
		for(int i=0;i<str.length()-1;i++) {
			
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')) {
				count++;
			}

		}
		
		System.out.println("number of words in a string--->" +count);
	}

}
