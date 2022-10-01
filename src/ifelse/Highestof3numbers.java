package ifelse;

public class Highestof3numbers {

	public static void main(String[] args) {

		int n1 = 10;
		int n2 = 40;
		int n3 = 30;

		if (n1 > n2 && n1 > n3) {

			System.out.println("n1 is greatest number");
		} else if (n2 > n1 && n2 > n3) {

			System.out.println("n2 is greatest number");
		} else {
			System.out.println("n3 is greatest number");
		}

	}

}
