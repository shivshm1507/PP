/*
3: 31 = 3 (Not an Armstrong Number)

153: 13 + 53 + 33 = 1 + 125+ 27 = 153 (Armstrong Number)

125: 13 + 23 + 53 = 1 + 8 + 125 = 134 (Not an Armstrong Number)

1634: 14 + 64 + 34 + 44 = 1 + 1296 + 81 + 256 = 1643 (Armstrong Number)

*/

package integerPrograms;

public class ArmstrongNumber {

	static boolean isArmstrong(int n) {

		int temp, digits = 0, last = 0, sum = 0;

		temp = n;
		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}
		temp = n;
		while (temp > 0) {

			last = temp % 10;
			sum += (Math.pow(last, digits));
			temp = temp / 10;
		}

		if (n == sum)

			return true;

		else
			return false;
	}

	public static void main(String args[]) {
	

		if (isArmstrong(153)) {
			System.out.print("Armstrong ");
		} else {
			System.out.print("Not Armstrong ");
		}
	}
}