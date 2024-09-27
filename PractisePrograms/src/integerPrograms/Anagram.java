package integerPrograms;

import java.util.Arrays;

public class Anagram {

	static boolean areAnagram(char[] ch1, char[] ch2) {

		int n1 = ch1.length;
		int n2 = ch2.length;

		if (n1 != n2)
			return false;

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		for (int i = 0; i < n1; i++)
			if (ch1[i] != ch2[i])
				return false;

		return true;
	}

	public static void main(String[] args) {

		char ch1[] = { 't', 'e', 's', 't' };
		char ch2[] = { 't', 'e', 's', 't' };

		if (areAnagram(ch1, ch2))
			System.out.println("The two strings are" + " anagram of each other");
		else
			System.out.println("The two strings are not" + " anagram of each other");

	}
}
