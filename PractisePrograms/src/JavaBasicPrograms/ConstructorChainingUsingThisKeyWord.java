package JavaBasicPrograms;

public class ConstructorChainingUsingThisKeyWord {

	int id;
	int roll;
	String name;
	String address;

	ConstructorChainingUsingThisKeyWord(int id) {

		this.id = id;
	}

	ConstructorChainingUsingThisKeyWord(int id, int roll) {
		this(id);
		this.roll = roll;
	}

	ConstructorChainingUsingThisKeyWord(int id, int roll, String name, String address) {

		this(id, roll);
		this.name = name;
		this.address = address;
	}

	public static void main(String[] args) {

		ConstructorChainingUsingThisKeyWord emp = new ConstructorChainingUsingThisKeyWord(100, 10, "Arjun",
				"DummyAddress");
		System.out.println("Emp Id :" + emp.id + " Emp Roll :" + emp.roll + " Emp Name :" + emp.name + " Emp Address :"
				+ emp.address);
	}

}
