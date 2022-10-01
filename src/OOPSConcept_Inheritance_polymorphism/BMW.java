package OOPSConcept_Inheritance_polymorphism;

public class BMW extends Car {//has-A relationship
	/*when method is present in parent class as well as in child class with same name and same number of arguement,
	is called method overriding*/
	public void start() {//overidden method
		System.out.println("BMW----starts");
	}
	
	public void threatSafety() {
		System.out.println("BMW----ThreatSafety");
	}

}
