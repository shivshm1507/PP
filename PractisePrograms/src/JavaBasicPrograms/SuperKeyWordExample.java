package JavaBasicPrograms;

class A {

	A() {
		System.out.println("In Default Constructor A");
	}
}

class B extends A {

	B() {

		System.out.println("In Default Constructor B");
	}

	B(int b) {

		System.out.println("In Parameterized Constructor of B");
	}
}

public class SuperKeyWordExample extends B {

	SuperKeyWordExample() {

		System.out.println("In default constructor of SuperKeyWordExample");
	}

	SuperKeyWordExample(int n) {

		super(5);
		System.out.println("In Parameterized constructor of SuperKeyWordExample");
	}

	public static void main(String[] args) {

		SuperKeyWordExample a = new SuperKeyWordExample(5);

	}

}
