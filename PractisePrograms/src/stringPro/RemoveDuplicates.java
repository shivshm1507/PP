package stringPro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

	public static void removeDuplicates(String s) {

		List<String> al = new ArrayList<String>();
		char[] ch = s.toCharArray();

		for (char c : ch) {

			al.add(Character.toString(c));
		}

		String[] s1 = al.toArray(new String[al.size()]);
		Arrays.stream(s1).distinct().sorted().forEach(x -> System.out.print(x));
	}

	public static void main(String[] args) {
		String s = "aadddcccfffggg";
		removeDuplicates(s);
	}
}
