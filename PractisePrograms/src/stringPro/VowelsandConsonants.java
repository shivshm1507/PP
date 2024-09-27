package stringPro;

public class VowelsandConsonants {

	public static void main(String[] args) {

		String str = "awertyh";
		getVowelsCount(str);

	}

	public static void getVowelsCount(String str) {
		str = str.toUpperCase();

		char[] ch = str.toCharArray();

		int vowel = 0;
		int consonent = 0;

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {

				vowel++;
			} else {

				consonent++;
			}
		}
		System.out.println("Vowel :" + vowel);
		System.out.println("consonent :" + consonent);
	}
}
