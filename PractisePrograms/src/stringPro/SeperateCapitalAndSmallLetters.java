package stringPro;

public class SeperateCapitalAndSmallLetters {

	public static void main(String[] args) {

		getString("AaabBCDeE");
	}

	public static void getString(String str) {

		StringBuilder caps = new StringBuilder();
		StringBuilder small = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			char[] ch = str.toCharArray();
			if (Character.isLowerCase(ch[i])) {

				small.append(ch[i]);
				
			}

			if (Character.isUpperCase(ch[i])) {

				caps.append(ch[i]);
				
			}

		}

		System.out.println("small :"+small);
		System.out.println("caps :"+caps);
	}
}
