package Encapsulation;

public class MyBank extends Account{

	public static void main(String[] args) {
		
		MyBank obj=new MyBank();
		obj.setId(10987);
		System.out.println(obj.getId());
		obj.setSalary(50000);
		System.out.println(obj.getSalary());
		
	}

}
