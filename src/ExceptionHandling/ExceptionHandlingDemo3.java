package ExceptionHandling;

public class ExceptionHandlingDemo3 {
	
	
	
	public static void main(String[] args)  {
		
		ExceptionHandlingDemo3 obj= new ExceptionHandlingDemo3();
		System.out.println("About thow keyword:-Used to design our own exception");
		
		try {
			
			throw new Exception("Pankaj ka exception");
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("Exception block executed");
		
	}
	
	
	
}