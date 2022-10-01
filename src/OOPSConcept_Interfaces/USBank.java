package OOPSConcept_Interfaces;

public interface USBank {
	
	int min_Bal=100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	//INTERFACE-1.only method declaration
		//2.no method body-only method prototype
		//3.In Inteface we can declare variables but variables are by default static in nature
		//.4.variables values cannot be changed because its final in nature
		//5.No static methods in Interface
		//6.no main method in interface
		//7.we cannot create object of interface
		//8.Interface is abstract in nature and provides 100% abstraction
}
