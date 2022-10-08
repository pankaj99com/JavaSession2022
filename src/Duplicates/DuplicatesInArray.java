package Duplicates;

public class DuplicatesInArray {

	public static void main(String[] args) {
		int[] a={8,2,2,4,3,5,7,6,4};
		
		int leng=a.length;
		int[] temp = new int[a.length];
		int j=0;
		
		for(int i=0;i<a.length-1;i++) {
			
			if(a[i]!=a[i+1]) {
				temp[j]=a[i];
				j++;
				
			}
			
		}
		
		temp[j]=a[a.length-1];
		for(int i=0;i<temp.length;i++) {
			System.out.print(temp[i]+" ");
		}
	}

}
