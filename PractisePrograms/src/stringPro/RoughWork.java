package stringPro;

import java.util.Scanner;

public class RoughWork {

	public static void reverseString() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence : ");
		String sentence = sc.nextLine();
		sc.close();
		String[] s = sentence.split(" ");

		String reverseSentence = "";

		for (int i = 0; i <= s.length-1; i++) {
			String word = s[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {

				reverseWord = reverseWord + word.charAt(j);
			}
			reverseSentence = reverseSentence + reverseWord + " ";

		}
		System.out.println(reverseSentence);
	}

	public static void main(String[] args) {
		reverseString();
	}
}