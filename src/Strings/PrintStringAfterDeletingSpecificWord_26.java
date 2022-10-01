package Strings;

import java.util.Scanner;

public class PrintStringAfterDeletingSpecificWord_26 {
	/* Delete the word "mom" and print */
	public static void main(String[] args) {

		String str = "India is great 24 Country mom";
		String w = "";
		str = str + " ";
		String ns="";

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);

			if (c != ' ') {
				w += c;
			} else {
				if(!w.equals("mom"))
					ns=ns+w+" ";
				

				w = "";
			}

		}
		System.out.println("new string after deleting specific word:"+ns);
	}
}
