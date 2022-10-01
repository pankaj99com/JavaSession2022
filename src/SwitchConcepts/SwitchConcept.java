package SwitchConcepts;

import java.util.Scanner;

public class SwitchConcept {

	public static void main(String[] args) {
		int age;
		
		System.out.println("ENTER YOUR AGE");
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		
		
		switch(age){
		case 18:
			System.out.println("you are Adult");
			break;
			
		case 23:
			System.out.println("you are going to join job");
			break;
			
		case 30:
			System.out.println("you are going to get married");
			break;
			
		case 60:
			System.out.println("you are going to retire");
			break;
			
		default:
			System.out.println("Invalid Entry");
			
			
		}

	}

}
