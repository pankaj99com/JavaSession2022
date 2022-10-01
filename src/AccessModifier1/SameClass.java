package AccessModifier1;

public class SameClass {

	public void M1() {
		System.out.println("M1---Public method");
	}

	private void M2() {
		System.out.println("M2---Private method");
	}

	protected void M3() {
		System.out.println("M3---Protected method");
	}

	void M4() {
		System.out.println("M4---Default method");
	}

	public static void main(String[] args) {
		
		SameClass s=new SameClass();
		s.M1();
		s.M2();
		s.M3();
		s.M4();

	}

}
