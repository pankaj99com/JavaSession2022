package ObjectOrientedConcepts;

public class FunctionsAndMethods {

	public static void main(String[] args) {
		FunctionsAndMethods obj=new FunctionsAndMethods();
		A a=obj.new A();
		a.Add(10,10);
		a.Add(10, 10, 10);
		
		B b=obj.new B();
		b.Add(50, 100);
		
		
	}

	public class A {

		public int Add(int x, int y) {
			System.out.println("Addition of 2 numbers");
			int res = x + y;
			
			System.out.println(res);
			return res;
		}

		public int Add(int x, int y, int z) {
			System.out.println("Addition of 3 numbers");
			int res = x + y + z;
			System.out.println(res);
			return res;
		}

	}

	public class B {

		public int Add(int x, int y) {
			System.out.println("Addition of 2 numbers");
			int res = x + y;
			
			System.out.println(res);
			return res;
		}

		public int Add(int x, int y, int z) {
			System.out.println("Addition of 3 numbers");
			int res = x + y + z;
			System.out.println(res);
			return res;
		}

	}

}
