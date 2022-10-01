package AboutExceptionHandling;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		
	//Uncaught Exception
		
		//Handling using try catch block

    try {
		int i=9/0;

		System.out.println(i);
	} catch (ArithmeticException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println(e.getMessage());
		System.out.println("My message--cannot divide by zero");
	}
    
    System.out.println("Print ABC");
    System.out.println("Print ABC");
    System.out.println("Print ABC");
	}

}
