package integerPrograms;

import java.util.Arrays;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int[] intArray = { 1, 4, 2, 6, 7, 9, 11 };
		Arrays.sort(intArray);

		int num = 1;
		for (int n : intArray) {
			if (n != num) {
				System.out.println("Missing Number is :" + num);
				num++;
			}
			num++;
		}
	}
}
