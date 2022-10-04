package Strings;

import java.util.Scanner;

public class PrintLargestWordsFromAString_21 {
	/* Print longest word in a string */
	public static void main(String[] args) {

		String str = "India is great 24 Country mom";
		String w = "";
		str = str + " ";
		String longestword = "";

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);

			if (c != ' ') {
				w += c;
			} else {
				if (w.length() > longestword.length()) {
					
					longestword = w;
					
				}

				w = "";
			}

		}
		System.out.println("Longest word in a String is:" + longestword);
	}
}
