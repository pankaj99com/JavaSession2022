package AccessModifier1;

public class A {
	
	public   void test() {
		System.out.println("A---public test method");
	}

	private void test1() {
		System.out.println("A--- private test method2");
	}
	
	protected void test3() {
		System.out.println("A---protected test method 3");
	}
	
	void test4() {
		System.out.println("A---- default test method 4");
	}
}
