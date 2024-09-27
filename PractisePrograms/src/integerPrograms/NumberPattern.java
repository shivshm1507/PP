/*
1
23
456
78910
1112131415
161718192021
*/

package integerPrograms;

public class NumberPattern {
	

	public static void getPattern(int n) {
		
		int count=0;
		for (int i = 0; i <= n; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print(++count);
			}

			System.out.println("");
		}

	}

	public static void main(String[] args) {

		getPattern(50);
	}

}
