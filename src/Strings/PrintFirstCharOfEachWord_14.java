package Strings;

import java.util.Scanner;

public class PrintFirstCharOfEachWord_14 {
	/* Print 1st character of each word in a sepearte line */
	public static void main(String[] args) {

		String str = "India is great 24 Country";
		String w = "";
		str = str + " ";// extra space added to original string so that my logic
						// of extracting the word based on space should work
						// perfectly

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);

			if (c != ' ') {
				w += c;
			} else {
				System.out.println(w.charAt(0));// logic change here
				w = "";
			}

		}

	}
}
