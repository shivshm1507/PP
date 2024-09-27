package stringPro;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates2 {

	public static void main(String[] args) {

		Set<Character> set = new HashSet<>();

		String str = "aaaabbbcccc";
		char[] ch = str.toCharArray();

		for (int i = 0; i <= ch.length - 1; i++) {
			set.add(ch[i]);
		}

		System.out.println(set);
	}

}
