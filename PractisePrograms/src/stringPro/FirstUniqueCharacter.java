package stringPro;

public class FirstUniqueCharacter {

	public static int firstUniqChar(String s) {

		for (int i = 0; i < s.length(); i++) {
			boolean found = true;

			for (int j = 0; j < s.length(); j++) {
				if (i != j && s.charAt(i) == s.charAt(j)) {
					found = false;
					break;
				}
			}
			if (found)
				return i;

		}
		

		return -1;
	}

	public static void main(String[] args) {
		String s = "allikarjun";
		int n = firstUniqChar(s);		
		System.out.println(s.charAt(n));
	}
}
