package ObjectOrientedConcepts;

public class ClassAndObject {
	
	static String color= "Red";
	
	/*we can access static variable using dot operator something like classname.variablename
	 * When we use static keyword then it is placed in common location in the memory and everyone can access it
	 * and we need not have to create object for it.
	 */
	
	
	int model;
	int wheels;
	/*These are non static variable and not free so in order to access these variables we need to create object
	 */
	
	public static void main(String[] args) {
		/*
		 * CLASS:-Class is a template 
		 * AIEEE application form available online
		 * for everyone is an example of class When someone fills and submit
		 * then it becomes there copy and this is called object
		 */
		//main()-it is method available inside jvm and it is starting point of execution in the java program
		
		//static-without creating any object also jvm can call this method
		
		//void-main() method cannot return anything to jvm
		
		//String[]args-This is command line arguement
		
		/*we can also change the order of the modifier and can be written as:
		 * static public void main(String[] args)
		 * 
		 * Inheritance concept is applicable for static method including main() method 
		 * hence if the child class doesn't have main() method then parent class main() will be executed 
		 * while executing child class.
		 */
		
		
		
		ClassAndObject car=new ClassAndObject();
		ClassAndObject car1=new ClassAndObject();
		car.model=2021;
		car.wheels=4;
		String myColor=ClassAndObject.color;
		
		car1.model=2022;
		car1.wheels=5;
		String myColor1=ClassAndObject.color;
		
		/* Object is created and present in the heap memory and reference variable which is present
		 * in the stack memory is pointing to the object
		 * 
		 */
		
		System.out.println(car.model);
		System.out.println(car.wheels);
		System.out.println(car.color);
		
		System.out.println(car1.model);
		System.out.println(car1.wheels);
		System.out.println(car1.color);
		
		
		car=car1;//Assigning reference variable
		System.out.println(car.model);
		
	}

}
