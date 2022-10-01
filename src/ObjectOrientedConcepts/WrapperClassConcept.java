package ObjectOrientedConcepts;

public class WrapperClassConcept {

	public static void main(String[] args) {

		String x = "100";

		System.out.println(x + 20);// 10020

		// I want to convert String "100"to integer then I have to use Wrapper
		// Integer class and use its method.

		// 1.String ---->Integer
		int i = Integer.parseInt(x);// data conversion from String to Integer

		System.out.println(i + 20);// 120

		// 2.String--->Double

		String y = "12.88";
		double d = Double.parseDouble(y);
		System.out.println(d + 12.9);// 25.78

		// 3.String ---->Boolean
		String z = "true";
		boolean b = Boolean.parseBoolean(z);
		System.out.println(b);
		
		//4.Integer---->String
		
		int k=234;
		String str=String.valueOf(k);
		System.out.println(str+10);//23410
		
		
		//Number format exception -if String value is not pure numeric value
		
		String g="1200k";
		System.out.println(g.substring(0,4));
		int gg=Integer.parseInt(g);//number format exception
		System.out.println(gg);

	}

}
