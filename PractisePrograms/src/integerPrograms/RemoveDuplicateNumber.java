package integerPrograms;

import java.util.Arrays;

public class RemoveDuplicateNumber {

	public static void main(String[] args) {

		int[] num = { 3, 2, 4, 5, 2, 1, 5, 5 };
		//distinct() removes duplicates and send unique element
		Arrays.stream(num).distinct().sorted().forEach(a -> System.out.print(a + " "));

		String[] arr = { "Mango", "Banana", "Kiwi", "Apple" };
		Arrays.stream(arr).sorted().forEach(a -> System.out.println(a));

	}
}
