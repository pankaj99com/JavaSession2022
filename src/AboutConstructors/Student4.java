package AboutConstructors;

public class Student4  {
	
	Student4(String name){
		this();
		System.out.println("i am parameterized constructor");
		
		//this();super() and this() should be the first statement
	}

	
	Student4(){
	
		System.out.println("no arguement constructor");
	}
	public static void main(String[] args) {


		Student4 s=new Student4("Pankaj");
		

	}

}
