package FactorsProblem;

import java.util.Scanner;

public class CheckIfNoIsPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=sc.nextInt();
		int n=0;
		n=number;
		int count=0;
		for(int i=1;i<=n;i++) {
			
			if(n%i==0) {
			count++;
			}
		}
		if(count==2) {
			
			System.out.println("Its a PRIME NUMBER");
		}else {
			System.out.println("Its not a PRIME NUMBER");
		}

	}

}
