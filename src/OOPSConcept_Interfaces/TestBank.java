package OOPSConcept_Interfaces;

public class TestBank {

	public static void main(String[] args) {

		System.out.println(USBank.min_Bal);
		// USBank.min_Bal=200; we cannot change the value of interface variable
		// because its final in nature
		// USBank b=new USBank(); we cannot create object of Interface

		HSBC h = new HSBC();// compile time poymorphism
		h.credit();// overidden method
		h.debit();// overidden method
		h.transferMoney();// overidden method
		h.CarLoan();
		h.EducationLoan();
		h.mutualFund();

		USBank u = new HSBC();// Dynamic polymorphism

		u.credit();
		u.debit();
		u.transferMoney();
		// u.EducationLoan(); Cannot access child class methods
		// u.CarLoan();

	}

}
