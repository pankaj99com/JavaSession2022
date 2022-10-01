package DataTypes;

public class Datatypes {

	public static void main(String[] args) {
		
		//Primitive datatpe:-boolean,char,byte,short,int,long,float,double
		
		//Non-Primitive datatype:-classes,Interfaces,Arrays etc.
		
		//1.int datatype:
		int i=10;
		//int 1=20;//not allowed to declare same  variable name
		
		i=20;//this is allowed but it will update the new value i.e 20;
		
		//i=20.0; we cannot store double value in integer
		System.out.println(i);//output will be 20
		
		
		//2. double datatype
		
		double d=20.90D;
		
		System.out.println(d);
		
		double d1=20;
		System.out.println(d1);//output will be 20.0
		//we can store the integer value in double
		
		//3. char datatype
		
		//any single character written inside single quotes is treated as char
		
		char ch='1';
		char ch1='A';
		
		//char ch2='AB';//not allowed
		
		System.out.println(ch);
		System.out.println(ch1);
		
		//4.boolean datatypes-this datatype used to store true and false values only and are case sensitive
		
		boolean b=true;
		boolean b1=false;
		
		System.out.println(b);
		System.out.println(b1);
		
		
		//5.String datatype--non primitive datatype
		
		//String is a class and multiple chararcters can be written within double quotes
		
		String str="Pankaj";
		
		System.out.println(str);
		
		//6.byte-
		
		//byte by=128;
		byte by=127;
		System.out.println(by);

	}

}
