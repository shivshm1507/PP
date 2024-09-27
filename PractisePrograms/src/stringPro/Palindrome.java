package stringPro;

public class Palindrome {

	public static void main(String[] args) {

		String s = "Abba";

		String rev = "";
		char ch;

		for (int i = 0; i < s.length(); i++) {

			ch = s.charAt(i);
			rev = ch + rev;

		}
		System.out.println(rev);

		if (s.equalsIgnoreCase(rev)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not a Palindrome");
		}
	}

}
