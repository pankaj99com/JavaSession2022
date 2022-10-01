package Strings;

public class StringManupulations {

	public static void main(String[] args) {

		int a = 100, b = 200;
		double d = 20.99d , d1 = 12.33d;

		String s = "Hello";
		String s1 = "Hell";
		String s2 = "Hello";

		// 1.length
		System.out.println(s.length());// 5

		// 2.character at particular position within string

		System.out.println(s.charAt(4));

		// 3.Substring-String within String

		System.out.println(s.substring(2, 4));

		// 4.CompareTo-to compare 2 strings and return type is Integer value

		System.out.println(s.compareTo(s1));// 1-it means strings are not equal

		System.out.println(s.compareTo(s2));// 0-it means strings are equal

		// 5.contains-to check if particular char is present inside the string
		// or not.
		// return type is boolean

		System.out.println(s.contains("pa"));// false

		System.out.println(s.contains("He"));// true

		// 6.equals-returns boolean true if strings rae equals else false

		System.out.println(s.equals(s1));// false

		System.out.println(s.equals(s2));// true

		// 7. valueof():-Returns string representation of the primitive data
		// types

		System.out.println(s.valueOf(d));// double represented as string
		System.out.println(s.valueOf(s));

		// 8.toString()

		System.out.println(s.toString());

		// 9.indexof()-returns the first index of a particular character within
		// the string starting from left

		// Also if the character is not present in the string then it will
		// return -1 or negative value

		System.out.println(s.indexOf('l'));

		System.out.println(s.indexOf('k'));// -1 since not present in string s

		// 10.lastindexof()-returns the last index of a particular character
		// within the string starting from left

		System.out.println(s.lastIndexOf('l'));

		// 11.Strings artithmetic operations
		String str = "Pankaj";

		System.out.println(a + b);// 300
		System.out.println(s + str);// HelloPankaj
		System.out.println(a + b + s + str);// 300HelloPankaj
		System.out.println(s + str + a + b);// HelloPankaj100200
		System.out.println(s + str + (a + b));// HelloPankaj300
		System.out.println(a + b + s + str + a + b);// 300HelloPankaj100200

		// 12.toUpperCase()
		System.out.println(s.toUpperCase());

		// 13.to LowerCase()

		System.out.println(s.toLowerCase());

		// 14.trim() to trim extra spaces
		System.out.println(s.trim());

		System.out.println(s.replace("Hello", "vvvvv"));

		// 15.toCharArray()-converts string into char Arrays

		char[] ch = s.toCharArray();
		System.out.println(ch);
		for (int i = 0; i < s.length(); i++) {

			System.out.println(ch[i]);
		}
	}

}
