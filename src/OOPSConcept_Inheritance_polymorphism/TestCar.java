package OOPSConcept_Inheritance_polymorphism;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b=new BMW();//Compile time or static polymorphism because at the time of compile time only jvm will decide 
		                  //which method to be called
		b.start();//overidden method
		b.stop();
		b.refuel();
		b.threatSafety();
		b.engine();
		
		System.out.println("*******************************");
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		//c.threatSafety(); Parent cannot access child class method
		System.out.println("********************************");
		
		//Topcasting or upcasting
		Car c1=new BMW();//child class object can be referred by parent class reference variable is called 
	                        	//Dynamic or runtime poymorphism.
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		//c1.threatSafety();
		System.out.println("******************");
		
		
		//Downcasting 
		//BMW b1=new Car();//not allowed
		BMW b1=(BMW) new Car();//This will be throw class cast exception
		
		
		
		
	}

}
