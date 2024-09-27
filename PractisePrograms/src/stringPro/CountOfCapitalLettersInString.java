package stringPro;

public class CountOfCapitalLettersInString {

	public static void main(String[] args) {

		String s = "MallikarJun";

		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				System.out.println(ch);
				count++;
			}

		}
		System.out.println(count);
	}

}
