package OOPSConcept_Abstraction;

public class TestBank {

	public static void main(String[] args) {
		HDFC h=new HDFC();
		h.credit();
		h.debit();
		h.loan();
		h.funds();
		
		
		Bank b=new HDFC();
		b.credit();
		b.debit();
		b.loan();
		

	}

}
