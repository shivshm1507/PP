package integerPrograms;

public class SmallestOfThreeNumbers {

	public static void getSmallestNumber(int n1, int n2, int n3) {

		int temp, smallest;

		temp = n1 < n2 ? n1 : n2;
		smallest = temp < n3 ? temp : n3;
		System.out.println("Smallest number is :" + smallest);

	}

	public static void main(String[] args) {

		getSmallestNumber(23, 33, 110);
	}

}
