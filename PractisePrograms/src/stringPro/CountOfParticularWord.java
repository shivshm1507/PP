package stringPro;

import java.util.Scanner;

public class CountOfParticularWord {

	public static void getString(String sentence) {
		int count = 0;
		String[] str = sentence.split(" ");
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter the Word :");
		String word = myobj.nextLine();

		for (int i = 0; i <= str.length - 1; i++) {

			if (str[i].equalsIgnoreCase(word)) {

				count++;
			}
		}

		System.out.println(count);
	}

	public static void main(String[] args) {
		String s1 = "My Name Name Name Name is Arjun Arjun";
		getString(s1);
	}

}
