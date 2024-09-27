package integerPrograms;

public class FibonacciSeries {

	public static void getFibonacci (int n)
	  {

		int n1 = 0, n2 = 1, n3 = 0;

		for (int i = 0; i <= n; i++)
		  {

			n3 = n1 + n2;
			System.out.println (n3);
			n1 = n2;
			n2 = n3;
		  }
	  }

	  public static void main (String[]args)
	  {
		getFibonacci (10);
	  }

}
