package AccessModifier2;

import AccessModifier1.A;

public class B extends A{

	public static void main(String[] args) {
		B b=new B();
		b.test();
		//b.test1(); cannot access  private functions in sub class
		b.test3();
		//b.test4();cannot access default functions in sub class 
		
	
		
		Test t =new Test();
		t.A1();
		//t.A2(); cannot access private function within same package
		t.A3();
		t.A4();
		
	}

}
