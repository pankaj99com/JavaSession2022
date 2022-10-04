package Strings;

import java.util.Scanner;

public class PrintFirstTwoCharOfEachWord_15 {
/* Print 1st two character of each word in a sepearte line*/
	public static void main(String[] args) {

		String str="India is a great 24 Country";
		String w="";
		 str=str+" ";
	
		for(int i=0;i<str.length();i++) {
			
			char c=str.charAt(i);
			
			if(c!=' ') {
				w+=c;
			}
			else 
			{
				if(w.length()<2) {
					System.out.println(w);
				}else {
					
				
				System.out.println(w.substring(0,2));
				w="";
				}
		}
		
	
	}

}
}
