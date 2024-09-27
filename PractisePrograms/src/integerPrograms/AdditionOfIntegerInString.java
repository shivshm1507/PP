package integerPrograms;

public class AdditionOfIntegerInString {

	public static void main(String[] args) {

		String s = "RHF334J84J";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				int a = Integer.parseInt(String.valueOf(ch));
				sum = sum + a;
			}
		}
		System.out.println(sum);

	}

}
