package JavaBasicPrograms;

//this(); keyword refers to current class instance variable or current class object;
//super(); keyword refers to parent class instance variable or super class object;

class AB {
	int a = 10;
}

public class SuperKeyWordEx2 extends AB {

	int a = 20;

	public void show(int a) {

		System.out.println("a :"+a);
		System.out.println("this.a :"+this.a);
		System.out.println("super.a :"+super.a);
	}

	public static void main(String[] args) {

		SuperKeyWordEx2 obj1 = new SuperKeyWordEx2();

		obj1.show(30);
	}

}
