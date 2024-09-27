package integerPrograms;

import java.util.HashSet;

public class MissingNumberInArray2 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 6, 8, 9 };
		HashSet<Integer> set = new HashSet<>();
		int max = 9;

		for (int n : arr) {

			set.add(n);
		}

		for (int i = 1; i <= max; i++) {

			if (!set.contains(i)) {

				System.out.println(i);
			}
		}

	}
}
