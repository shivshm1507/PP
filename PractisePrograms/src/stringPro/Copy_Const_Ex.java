package stringPro;

public class Copy_Const_Ex {

	// copy constructor example
	int i;
	String name;

	Copy_Const_Ex() {

		i = 10;
		name = "Arjun";
		System.out.println(i + name);
	}

	Copy_Const_Ex(Copy_Const_Ex r) {

		i = r.i;
		name = r.name;
		System.out.println(i + name);
	}

	public static void main(String[] args) {

		Copy_Const_Ex t = new Copy_Const_Ex();
		Copy_Const_Ex t1 = new Copy_Const_Ex(t);

	}

}
