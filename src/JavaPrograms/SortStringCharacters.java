package JavaPrograms;

public class SortStringCharacters {

	public static void main(String[] args) {

		String s = "PANKAJ";
		String s1="";
		String str=s.toLowerCase();
		char[] ch = str.toCharArray();
		char temp;
		for (int i = 0; i < ch.length; i++) {

			for (int j = 0; j < ch.length-1; j++) {

				if (ch[j] > ch[j+1]) {//bubble sort
					temp = ch[j];
					ch[j] = ch[j+1];
					ch[j+1] = temp;
				}
			}
		}
		System.out.println(new String(ch));
		for(int j=0;j<s.length();j++) {
			
			System.out.print(ch[j]+"");
			
		}
	}

}
