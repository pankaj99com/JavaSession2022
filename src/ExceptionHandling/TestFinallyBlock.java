package ExceptionHandling;

import java.util.Scanner;

public class TestFinallyBlock {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		try {
			if(n<0) {
				System.out.println("Please enter postive number");
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		System.gc();
		try {
			
			n=n/4;
			
			System.out.println(n);
		}
		catch(Exception pankaj) {
			
			System.out.println(pankaj.getMessage());
			
		}
		
		finally {
			System.out.println("finally block is executed");
			System.out.println(n);
		  }
		System.out.println("Take rest");
		System.out.println("Closing connection");
		
	}

}
