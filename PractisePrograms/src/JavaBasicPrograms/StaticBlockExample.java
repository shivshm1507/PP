package JavaBasicPrograms;

public class StaticBlockExample {

	static String str;
	static int n;

	static {
		str = "In static block";
		n = 0;
		System.out.println(str + n);
	}

	public static void main(String[] args) {

		System.out.println("In main method");
	}

}
