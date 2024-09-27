package integerPrograms;

public class Factorial {

	public static void getFactorial(int n) {

		int fact = 1;

		for (int i = 1; i <= n; i++) {

			fact = fact * i;
		}

		System.out.println(fact);
	}

	public static void main(String[] args) {

		getFactorial(7);
	}
}
