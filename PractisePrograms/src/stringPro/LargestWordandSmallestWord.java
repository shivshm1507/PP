package stringPro;

public class LargestWordandSmallestWord {

	public static void main(String args[]) {

		String s = "Hardships often prepare ordinary people for an " + "extraordinary destiny";

		int min = 100;
		int max = 0;
		String largeWord = "";
		String smallWord = "";

		String[] s1 = s.split(" ");

		for (int i = 0; i < s1.length; i++) {

			if (s1[i].length() > max) {

				max = s1[i].length();
				largeWord = s1[i];
			}

			if (s1[i].length() < min) {

				min = s1[i].length();
				smallWord = s1[i];
			}

		}
		System.out.println("Largest word is :" + largeWord + " : " + max);
		System.out.println("Smallest word is :" + smallWord + " : " + min);

	}
}
