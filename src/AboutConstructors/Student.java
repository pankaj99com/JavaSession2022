package AboutConstructors;

public class Student {
	
	int rollno;
	String name;

	public static void main(String[] args) {
		
		Student s1=new Student();
		Student s2=new Student();
		System.out.println(s1.name);
		System.out.println(s1.rollno);
		System.out.println(s2.name);
		System.out.println(s2.rollno);

	}

}
