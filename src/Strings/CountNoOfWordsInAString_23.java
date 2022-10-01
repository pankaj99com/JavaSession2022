package Strings;

import java.util.Scanner;

public class CountNoOfWordsInAString_23 {
	/* Count number of words in a String */
	public static void main(String[] args) {

		String str = "India is great 24 Country mom";
		String w = "";
		str = str + " ";
		int count=0;

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);

			if (c != ' ') {
				w += c;
			} else {
				count++;
				
				w = "";
			}

		}
		System.out.println("number of words in a string:"+count);
	}
}
