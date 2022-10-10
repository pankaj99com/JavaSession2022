package ExceptionHandling;

public class ExceptionHandlingDemo4 {
	
	
	
	public static void main(String[] args)  {
		
		ExceptionHandlingDemo4 obj= new ExceptionHandlingDemo4();
		System.out.println("About throw keyword:-Used to design our own exception");
		
		try {
			
			throw new Exception("Pankaj ka exception");
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("Exception block executed");
		
		String flag="N";
		if(flag.equals("N")) {
			try {
				throw new Exception("flag is set to N and it cannot move further");
			}catch(Exception e) {
				e.printStackTrace();
				e.getMessage();
			}
			System.out.println("All exception handled");
		}else {
			
			System.out.println("Thanks for choosing Y you are allowed to execute java code");
		}
		
	}
	
	
	
}