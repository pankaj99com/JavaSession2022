package AboutConstructors;

public class B extends A{
	
	public B() {
		super();
		System.out.println("Child class constructor");
	}
	
	public B(int i) {
		super(i);
		
	}
	
	public B(int i,int j) {
		super(i,j);
		
	}

	public static void main(String[] args) {
		B b=new B();
		B b1=new B(10);
		B b2=new B(10,20);

	}

}
