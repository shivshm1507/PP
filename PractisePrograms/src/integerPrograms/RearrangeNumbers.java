package integerPrograms;

public class RearrangeNumbers {

	public static void main(String[] args) {

		String str = "0000345tgvbhu789";
		rearrangeIntegers(str);
	}

	public static void rearrangeIntegers(String str) {

		StringBuilder digits = new StringBuilder();
		StringBuilder nonDigits = new StringBuilder();

		for (char ch : str.toCharArray()) {

			if (Character.isDigit(ch)) {

				digits.append(ch);

			} else {
				nonDigits.append(ch);
			}
		}

		System.out.println(digits.append(nonDigits));
	}
}
