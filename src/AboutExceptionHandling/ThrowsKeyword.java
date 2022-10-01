package AboutExceptionHandling;

public class ThrowsKeyword {

	public static void main(String[] args) throws ArithmeticException {
		
		ThrowsKeyword obj= new ThrowsKeyword();
		System.out.println("Main calling sum method");
		obj.sum();
		
	}
	public void sum() throws ArithmeticException {
		System.out.println("Sum calling Div method");
		
		div();
	}

		
	
	public void div() throws ArithmeticException {
		
		System.out.println("This is div method");
		
		try {
			int i=9/0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Test method in div after exception");
	}
}
