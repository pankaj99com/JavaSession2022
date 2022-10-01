package AboutExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		// Throw keyword is used when we want to throw exception deliberately

		System.out.println("Test");

		try {
			throw new Exception("Pankaj's exception");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("End");
	
	// throw new Exception("Pankaj's Exception"); we have to add throws
	// exception
	// but below print statement will throw error because no one is handling
	// exception not even JVM
	// So always use try cstch to handle exception whenever throwing exception
	// deliberately

	String exec_flag="N";

	if(exec_flag.equals("N"))
	{
		try {
			throw new Exception("Flag set to N");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Exception is handled");
	}
}
}

