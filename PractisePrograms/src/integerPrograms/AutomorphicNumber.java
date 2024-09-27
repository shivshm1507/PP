/*A number is called an automorphic number if and only if the square of the given number 
ends with the same number itself. For example, 25, 76 are automorphic numbers 
because their square is 625 and 5776, respectively and the last two digits of the square 
represent the number itself. Some other automorphic 
numbers are 5, 6, 36, 890625, etc.*/

package integerPrograms;

public class AutomorphicNumber {

	public static boolean isAutomorphic(int num) {
		int square = num * num;

		while (num > 0) {

			if (num % 10 != square % 10)
				return false;
			num = num / 10;
			square = square / 10;
		}
		return true;
	}

	public static void main(String args[]) {

		System.out.println(isAutomorphic(25) ? "Automorphic" : "Not Automorphic");
	}
}
