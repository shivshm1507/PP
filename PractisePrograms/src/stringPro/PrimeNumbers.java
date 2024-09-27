package stringPro;

public class PrimeNumbers {

	public static void checkPrime(int n) {

		int temp = 0;

		if (n <= 1) {
			System.out.println(n + " This number is not a prime number");
		}

		for (int i = 2; i <= n - 1; i++) {

			if (n % i == 0) {

				temp = temp + 1;
			}
		}

		if (temp == 0) {
			System.out.println(n + "This is a prime number");
		} else {
			System.out.println(n + " This is not a Prime number");
		}
	}

	public static void main(String[] args) {

		checkPrime(13);
	}

}
