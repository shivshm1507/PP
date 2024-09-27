package stringPro;

public class ReverseWordOfString {

	public static void reverseString(String s) {

		String[] words = s.split(" ");

		for (String word : words) {

			StringBuilder sb = new StringBuilder(word);
			sb.reverse();

			System.out.print(sb + " ");
		}

	}

	public static void main(String[] args) {
		String s = "This is a sample java program";
		reverseString(s);
	}
}
