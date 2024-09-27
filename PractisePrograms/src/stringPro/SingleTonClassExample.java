package stringPro;

/*
 * To create a singleton class, we must follow the steps, given below:
 * Ensure that only one instance of the class exists.
 * Provide global access to that instance by:
 * Declaring all constructors of the class to be private.
 * Providing a static method that returns a reference to the instance. The lazy initialization concept is used to write the static methods.
 * The instance is stored as a private static variable.
 * The example of singleton classes is Runtime class, Action Servlet, Service Locator. Private constructors and factory methods are also an example of the singleton class.
*/

public class SingleTonClassExample {

	private static SingleTonClassExample var = null;
	private String str;

	private SingleTonClassExample() {

		str = "I'm a Coder";
	}

	public static SingleTonClassExample getInstance() {

		if (var == null) {
			var = new SingleTonClassExample();
		}
		return var;
	}

	public static void main(String[] args) {

		SingleTonClassExample a = SingleTonClassExample.getInstance();
		SingleTonClassExample b = SingleTonClassExample.getInstance();
	

		a.str = a.str.toLowerCase();
		System.out.println(a.str);
		b.str = b.str.toUpperCase();
		

		System.out.println(a.str);
		System.out.println(b.str);
		
		
	}

}
