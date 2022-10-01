package OOPSConcept_Abstraction;

public abstract class Bank {
	
	public abstract  void loan();//abstarct method
	
	//non abstract methods are also allowed in Abstract class
	//int x;
//	Bank(int x){
//		
//		this.x=x;
//		System.out.println("Abdtract class can have constructor");
//	}
	
	public void credit(){
		
		System.out.println("Bank ---Credit");
		
	}
	public void debit(){
		
		System.out.println("Bank ---debit");
		
		//Bank b=new Bank();
		
		
	}
	

}
