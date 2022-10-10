package ExceptionHandling;

public class ExceptionHandlingDemo2 {
	
	public void add() {
		System.out.println("addition is calling div");
		div();
	}
	
	public void div() throws ArithmeticException {
		System.out.println("div is calling exception");
		
		try {
			int i=9/0;
		} catch (ArithmeticException e) {
			
			e.printStackTrace();
		}
		System.out.println("Check the execution");
	}

	
	public static void main(String[] args)  {
		
		ExceptionHandlingDemo2 obj= new ExceptionHandlingDemo2();
		System.out.println("main is calling sum");
		obj.add();
		System.out.println("Exception returned to main");
	}
	
	
	
}