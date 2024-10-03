package stringPro;

public class RoughWork {

	public static void main(String[] args) {

		int sum = 0;
		int[] n = { 1, 5, 'A', 7,'h',6,10};

		for (int i = 0; i <= n.length-1; i++) {

			if (!Character.isAlphabetic((char) n[i]))

				sum = n[i] + sum;
		}

		System.out.println(sum);
	}
}