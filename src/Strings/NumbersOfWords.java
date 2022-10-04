package Strings;

import java.util.concurrent.SynchronousQueue;

public class NumbersOfWords {

	public static void main(String[] args) {
		String str="This is a String";
		str+=" ";
		String word="";
		int end=0,position=0,count=0;
		while(str.indexOf(' ',position)>0) {
			//System.out.println(position);
			end=str.indexOf(' ',position);
			
			//System.out.println("end"+end);
			word=str.substring(position,end);
			//System.out.println("word"+word);
			count++;
			position=end+1;
		}
		System.out.println(count);
	}

}
