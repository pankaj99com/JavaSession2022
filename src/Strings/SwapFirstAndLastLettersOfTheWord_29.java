package Strings;

import java.util.Scanner;

public class SwapFirstAndLastLettersOfTheWord_29 {
	/*swap first and last letters of the word*/
	public static void main(String[] args) {

		String str = "India is great 24 Country mom";
		String w = "";
		str = str + " ";
		String ns="";
		int count=0;

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);

			if (c != ' ') {
				w += c;
			} else {
				char first=w.charAt(0);
				char last=w.charAt(w.length()-1);
				String middle=w.substring(1,w.length()-1);
				ns=ns+last+middle+first+" ";

				w = "";
			}

		}
		System.out.println("new string:"+ns);
	}
}
