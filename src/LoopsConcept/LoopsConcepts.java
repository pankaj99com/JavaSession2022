package LoopsConcept;

public class LoopsConcepts {

	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);

		/*
		 * the above statement will print top 5 integer number but this very bad
		 * programming practice so to avoid above repeatitive code we go for
		 * loops concepts
		 */

		// 1.while loop

		// print 1 to 10 using while loop
		System.out.println("print 1 to 10 using while loop");
		int i = 1;// mandatory conditions for while loop
		// this is initializtion

		while (i <= 10) {// condition statement

			System.out.println(i);

			i++;// incrementation
		}
		
		// print 10 to 1 using while loop
		System.out.println("print 10 to 1 using while loop");
		int j=10;
		
		while(j>=1) {
			
			System.out.println(j);
			
			j--;
		}
		
		//2.do while
		System.out.println("printing 1 to 10 using do while loop");
		int m=1;
		
		do {
			System.out.println(m);
			m++;
		}while(m<=10);
	
		
		
		//3.for loop
		// print 1 to 10 using for loop
		System.out.println("print 1 to 10 using for loop");
		for(int k=1;k<=10;k++) {
			System.out.println(k);
		}
		
		//print 10 to 1 using for loop
		System.out.println("print 10 to 1 using for loop");
		
		for(int l=10;l>=1;l--) {
			System.out.println(l);
		}
		
	}

}
