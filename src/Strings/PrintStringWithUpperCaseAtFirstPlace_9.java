package Strings;

import java.util.Scanner;

public class PrintStringWithUpperCaseAtFirstPlace_9 {
/*string with Upper case at first place*/
	public static void main(String[] args) {

		String str="India is great 24 Country";
		String uc="";//create an empty string
		String r="";
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch)) {
				uc=uc+ch;
			}else {
				r=r+ch;
			}
			
		}
		String s=uc+r;
		System.out.println("New string with Upper case at first place--->" +s);
	}

}
