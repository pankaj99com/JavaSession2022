package Strings;

import java.util.Scanner;

public class MakeFirstLetterOfWordAsUpperCase_28 {
	/* make first letter of  word as upper case*/
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
				first=Character.toUpperCase(first);
				ns=ns+first+w.substring(1)+" ";

				w = "";
			}

		}
		System.out.println("new string:"+ns);
	}
}
