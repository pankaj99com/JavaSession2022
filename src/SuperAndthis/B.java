package SuperAndthis;

public class B extends A {
	
	String str="PANKAJ from Class B";
	
	public void m() {
		System.out.println(str);
		System.out.println(this.str);
		System.out.println(super.str);
		
	}

	public static void main(String[] args) {
		
		B b=new B();
		b.m();

	}

}
