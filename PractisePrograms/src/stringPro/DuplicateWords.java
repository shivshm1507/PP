package stringPro;
import java.util.HashMap;

public class DuplicateWords {

	public static void findDuplicateWords(String sentence) {

		HashMap<String, Integer> map = new HashMap<>();

		String s[] = sentence.split(" ");

		for (int i = 0; i < s.length; i++) {

			if (map.containsKey(s[i])) {

				int count = map.get(s[i]);
				map.put(s[i], ++count);
				
				if(count>=2) {
					System.out.println(s[i]+":"+count);
				}
			} else {

				map.put(s[i], 1);
			}
		}
		//System.out.println(map);
	}

	public static void main(String[] args) {

		findDuplicateWords("I love India India");
	}

}
