package integerPrograms;

public class RearrangeZeroInTheBegining {

	public static void main(String[] args) {
		String input = "32400121200";
		 rearrangeDigits(input);
		
	}

	public static void rearrangeDigits(String input) {
		
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		for (char c : input.toCharArray()) {
			if (Integer.parseInt(String.valueOf(c)) > 0) {
				sb.append(c);
			}else {
				
				sb1.append(c);
			}

		}

		System.out.println(sb1.toString() + sb.toString());
	}

}
