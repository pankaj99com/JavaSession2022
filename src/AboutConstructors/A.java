package AboutConstructors;

public class A {
	
	public A() {
		System.out.println("Parent class constructor ---no args");
	}

	
	public A(int a) {
		System.out.println("Parent class constructor ---1 args");
	}
	
	public A(int a,int b) {
		System.out.println("Parent class constructor ---2 args");
		System.out.println("Parent--value of a is"+a);
		System.out.println("Parent--value of b is"+b);
	}
}
