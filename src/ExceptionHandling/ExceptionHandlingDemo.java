package ExceptionHandling;

public class ExceptionHandlingDemo {

	int i;

	public static void main(String[] args) throws InterruptedException  {
		ExceptionHandlingDemo obj=new ExceptionHandlingDemo();
		
		Thread.sleep(2000);
		
		try {
		Thread.sleep(2000);//checked/complie time exception
		}catch(InterruptedException e) {
			
			System.out.println("This is an example of Interruped checked exception");
			
			e.getMessage();
			
			System.out.println("************");
			System.out.println(e.getMessage());
			
		}
		
		try {
			
			int i=9/0;
		
		}catch(ArithmeticException a) {
			
			System.out.println("test1");//runtime/unchecked exception
			
			System.out.println("test2");
	}
		
		
	}

}
