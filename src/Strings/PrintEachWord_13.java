package Strings;

import java.util.Scanner;

public class PrintEachWord_13 {
	/* Print each word in a sepearte line */
	public static void main(String[] args) {

		String str = "India is great 24 Country";
		String w = "";//
		str = str + " ";

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);

			if (c != ' ') {// if charcter is not spacecharcter then add that
							// character in an empty string
				w += c;
				
			} else {

				System.out.println(w);

				w = "";// empty the string after finding word without space
			}

		}

	}
}
