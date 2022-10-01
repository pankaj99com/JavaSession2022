package ConstructorChaining;

public class Student {
	public Student(double marks) {
		this(10);
		
		System.out.println("Double constructor");
		
		
	}
	
public Student(int marks) {
		this();
		System.out.println("Integer constructor");
		
		
	}

public Student() {
	
	System.out.println("no args constructor");
	
	
}

	public static void main(String[] args) {
		
		Student s1=new Student(10.8);
		
		System.out.println("*******************************************");
		Student s2=new Student(10);
		
		System.out.println("*******************************************");
		Student s3=new Student();
		
	}

}
