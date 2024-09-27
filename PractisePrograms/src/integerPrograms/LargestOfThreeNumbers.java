package integerPrograms;

public class LargestOfThreeNumbers {

	public static void getLargestOfThree(int n1, int n2, int n3) {

		int temp, largest;

		temp = n1 > n2 ? n1 : n2;
		largest = temp > n3 ? temp : n3;
		System.out.println("Largest number is :" + largest);
	}

	public static void main(String[] args) {
		
		getLargestOfThree(100, 60, 30);
	}

}
