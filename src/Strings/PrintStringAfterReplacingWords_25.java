package Strings;

import java.util.Scanner;

public class PrintStringAfterReplacingWords_25 {
	/*Replace the words with Another words */
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
				if(w.equals("great")) {
					ns=ns+"powerful"+" ";
				}else {
					ns=ns+w+" ";
				}
				

				w = "";
			}

		}
		System.out.println("new string after replacing words:"+ns);
	}
}
