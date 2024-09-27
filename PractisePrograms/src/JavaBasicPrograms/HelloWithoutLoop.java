package JavaBasicPrograms;

public class HelloWithoutLoop {

	static void printHello(int n) {

		if (n > 0) {
			System.out.println("Hello");
			printHello(n - 1);
		}

	}

	public static void main(String[] args) {

		printHello(5);
	}

}
