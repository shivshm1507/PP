package stringPro;

/*       *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
********** 

*/

public class RightHalfUpPyramid {

	public static void printPattern(int n) {
		int i, j, k;
		for (i = n; i >= 1; i--) {
			
			for (j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			for (k = 0; k <= n - i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		printPattern(10);
	}

}
