package stringPro;

public class ReverseWordOfSentence {

	public static void reverseWord(String str) {

		String[] s = str.split(" ");

		String reverseString = "";

		for (int i = 0; i < s.length; i++) {

			String word = s[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {

				reverseWord = reverseWord + word.charAt(j);
			}
			reverseString = reverseString + reverseWord + " ";

		}
		System.out.println(reverseString);
	}

	public static void main(String[] args) {

		reverseWord("Hi My Love");

	}

}
