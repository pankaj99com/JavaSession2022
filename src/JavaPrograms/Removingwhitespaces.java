package JavaPrograms;

public class Removingwhitespaces {

	public static void main(String[] args) {
		String str="programming";
		System.out.println(str.indexOf('q'));//-1
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			int idx=str.indexOf(ch,i+1);
			if(idx==-1) {
				sb.append(ch);
			}
			
		}
		System.out.println(sb);
	}

}
