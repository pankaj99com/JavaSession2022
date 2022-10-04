package Strings;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class ReversingEachWordInAString_12 {
/*Print String after reversing each word*/
	public static void main(String[] args) {

		String str="India is great 24 Country";
		String reverse="";//create an empty string
	
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			//System.out.println(ch);
			reverse=ch+reverse;
			//System.out.println("value present in reverse "+reverse);
			
		}
		
		System.out.println("New string after reversing each word--->" +reverse);
	}

}
