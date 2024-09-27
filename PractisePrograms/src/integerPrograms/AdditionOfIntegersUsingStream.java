package integerPrograms;

import java.util.Arrays;

public class AdditionOfIntegersUsingStream {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 4, 5 };
		//Arrays.asList(arr);
		int sum = Arrays.stream(arr).sorted().reduce(0, (a, b) -> a + b);
		System.out.println(sum);
	}
}