package Strings;

import java.util.Scanner;

public class MakeAlternateWordAsUpperCase_27 {
	/* make alternate word as upper case*/
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
				
				if(count++%2==0)
					ns=ns+w.toUpperCase()+" ";
				else
					ns=ns+w.toLowerCase()+" ";
				

				w = "";
			}

		}
		System.out.println("new string after changing the cases:"+ns);
	} 
}
