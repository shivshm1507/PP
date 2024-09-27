package stringPro;

public class PrintEachLetterTwice {

	public static void printLetterTwice(String str) {

		StringBuffer sb = new StringBuffer();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			sb = sb.append(ch[i]).append(ch[i]);
		}
		System.out.println(sb);
	}

	public static void main(String[] args) {

		String s1 = "Arjun";
		printLetterTwice(s1);
	}

}
