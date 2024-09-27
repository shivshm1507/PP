package integerPrograms;

import java.util.Arrays;

public class SortNumArrayWithoutStream {

	public static void main(String[] args) {

		int temp = 0;
		int[] num = {9,8,7,6,5,4,3,2,1 };
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {

			System.out.println(num[i]);
		}
	}

}
