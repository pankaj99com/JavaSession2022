package AboutConstructors;

public class Student1 {
	int rollno;
	String name;
	
	Student1(int rollno,String name){
		
		this.rollno=rollno;
		this.name=name;
	}

	public static void main(String[] args) {
		
		Student1 s1=new Student1(100,"PANKAJ");
		Student1 s2=new Student1(101,"ANAND");
		System.out.println(s1.name+ "-----"+s1.rollno);
		System.out.println(s2.name+ "-----"+s2.rollno);

	}

}
