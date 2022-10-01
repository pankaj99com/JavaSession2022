package ConstructorOverloading;

public class Java {
	
	public Java() {
		System.out.println("Default constructor");
	}

	public Java(int a) {
		System.out.println("Single param constructor");
	}
	
	public Java(int a,int b) {
		System.out.println("Double param constructor");
	}
	
	public Java(String name) {
		System.out.println("String  constructor");
	}
	public static void main(String[] args) {
		Java j1= new Java();
		
		Java j2= new Java(100);
		
		Java j3= new Java(1000,2000);
		
		Java j4= new Java("JAVA");
		

	}

}
