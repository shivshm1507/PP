/*Can the main method be Overloaded?
Yes, It is possible to overload the main method. We can create as many overloaded main methods we want.
 However, JVM has a predefined calling method that JVM will only call the main method with the definition of - 

public static void main(string[] args)*/


package JavaBasicPrograms;

public class MainMethodOverloaded {

	public static void main(int[] args) {
		System.out.println("Overloaded Integer array Main Method");
	}

	public static void main(char[] args) {
		System.out.println("Overloaded Character array Main Method");
	}

	public static void main(double[] args) {
		System.out.println("Overloaded Double array Main Method");
	}

	public  void main(float args) {
		System.out.println("Overloaded float Main Method");
	}

	public static void main(String args[]) {

		System.out.println(" Main Method");
	}
}
