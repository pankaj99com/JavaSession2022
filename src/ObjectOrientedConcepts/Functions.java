package ObjectOrientedConcepts;

public class Functions {

	// main method--starting point of the execution
	int n = 10;
	// non static methods

	// 1.type1-no input no output
	public void test() {
		System.out.println("test method");
	}

	// 2.type 2-no input some output

	public int pqr() {
		System.out.println("PQR method");
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}

	// 3. type 3-no input some output

	public String qa() {
		System.out.println("QA method");
		String s = "selenium";
		return s;
	}

	// 4.Type 4-Input parameters/Arguements
	public int division(int x, int y) {
		System.out.println("Division method");
		int d = x / y;
		return d;

	}

	public static void main(String[] args) {

		Functions f1 = new Functions();

		// one object will be created,f1 is the object reference
		// variable,referring to this object.
		// After creating the object,the copy of all non static methods will be
		// given to this object.

		f1.test();
		int result = f1.n;
		
		int d = f1.division(80, 2);
		System.out.println(d);
		
		int i = f1.pqr();
		System.out.println(i);

		
		String s = f1.qa();
		System.out.println(s);
		
	
	}

}
