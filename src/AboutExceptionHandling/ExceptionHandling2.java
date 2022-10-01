package AboutExceptionHandling;

public class ExceptionHandling2 {

	public static void main(String[] args) {

		// caught Exception

		try {
			Thread.sleep(5000);
			System.out.println("waiting for 5 secs");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			System.out.println("waiting ...");
		}
	}

}
