package Strings;

import java.util.Scanner;

public class FindWordsWithSearchCriteria_22 {
	/* Find Words with matching criteria, */
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
				if(w.equalsIgnoreCase("is")) {
					System.out.println(w);
					count++;
				}
				
				w = "";
			}

		}
		if(count==0) {
			System.out.println("No word found with matching criteria");
		}else {
			System.out.println("Found");
		}
	}
}
