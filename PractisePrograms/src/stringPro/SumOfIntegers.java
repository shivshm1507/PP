package stringPro;

public class SumOfIntegers {

	public static void getSum(int num) {

		int sum = 0;

		while (num != 0) {

			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}

		System.out.println(sum);
	}

	public static void main(String[] args) {

		getSum(56999);

	}

}
