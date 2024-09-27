package integerPrograms;

public class FIndEvenNumber {

	public static void getEvenNumber(int num) {

		for (int i = 1; i <= num; i++) {

			if (i % 2 == 0) {
				System.out.println(i + " is a Even Number");
			} else {
				System.out.println(i + " is odd number");
			}
		}
	}

	public static void main(String[] args) {

		getEvenNumber(10);

	}

}
