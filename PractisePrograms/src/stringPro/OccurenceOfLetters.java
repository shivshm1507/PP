package stringPro;

import java.util.*;

public class OccurenceOfLetters {

	static int temp = 0;
	static char largest;

	public static void main(String[] args) {

		String s = "ABBCCC";

		TreeMap<Character, Integer> map = new TreeMap<>(Collections.reverseOrder());

		for (int i = 0; i < s.length(); i++) {

			if (map.containsKey(s.charAt(i))) {

				int count = map.get(s.charAt(i));

				map.put(s.charAt(i), ++count);

				if (temp < count) {

					temp = count;
					largest = s.charAt(i);
				}

			} else {
				map.put(s.charAt(i), 1);
			}
		}
		System.out.println(largest + ":" + temp);
		System.out.println(map);
	}

}
