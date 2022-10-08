package ReverseNumber;

public class ReverseString {

	public static void main(String[] args) {
		String a="pankaj";
		int length=a.length();
		String rev="";
		for(int i=length-1;i>=0;i--){
			rev=rev+a.charAt(i);
		}
		System.out.print(rev);
		rev="";
		System.out.println();
		for(int i=0;i<a.length();i++){
			rev=a.charAt(i)+rev;
			
		}
		System.out.println(rev);
		
		

	}

}
