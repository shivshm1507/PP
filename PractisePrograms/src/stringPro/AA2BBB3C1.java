package stringPro;

public class AA2BBB3C1 {

	public static void main(String[] args) {
		getCount("aabac");
	}

	public static void getCount(String str) {
		int count = 1;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {

			if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {

				count++;
			} else {
				sb.append(str.charAt(i)).append(count);
				count = 1;
			}
		}

		System.out.println(sb);
	}

}



