package OOPSConcept_Interfaces;

public class HSBC implements USBank,BrazilBank{//here we are achieving multiple inheritance
	//This concept is called IS-A Relationship
	// if a class is implementing any interface then its mandatory to define or
	// override all methods of interfaces
	@Override
	public void credit() {
		System.out.println("HSBC---Credit");
	}

	@Override
	public void debit() {
		System.out.println("HSBC---debit");

	}

	@Override
	public void transferMoney() {
		System.out.println("HSBC---transferMoney");

	}

	public void EducationLoan() {
		System.out.println("HSBC---EducationLoan");
	}

	public void CarLoan() {
		System.out.println("HSBC----Car Loan");
	}

	@Override
	public void mutualFund() {
		System.out.println("HSBC---MutualFund");
		
	}

}
