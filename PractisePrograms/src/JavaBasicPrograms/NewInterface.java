package JavaBasicPrograms;

//Java program to demonstrate
//static method in Interface.

interface NewInterface {

	// static method
	 static void hello() {
		System.out.println("Hello, New Static Method Here");
	}

	// Public and abstract method of Interface
	void overrideMethod(String str);
}

