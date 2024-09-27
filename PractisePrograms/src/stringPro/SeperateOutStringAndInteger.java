package stringPro;

public class SeperateOutStringAndInteger {

	public static void main(String[] args) {

		String s = "A5d3s2h4";

		StringBuffer alphabets = new StringBuffer();
		StringBuffer numbers = new StringBuffer();

		for (int i = 0; i < s.length(); i++) {
			char[] ch = s.toCharArray();
			if (Character.isLetter(ch[i])) {

				alphabets.append(ch[i]);
			}
			if (Character.isDigit(ch[i])) {

				numbers.append(ch[i]);
			}
		}

		System.out.println("Sb :" + alphabets);
		System.out.println("Sb1 :" + numbers);
	}
}
