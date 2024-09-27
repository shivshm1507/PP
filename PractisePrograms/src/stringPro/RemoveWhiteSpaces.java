package stringPro;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		
		String s= "I Love Coding";
		char ch;
		
		for(int i=0;i<s.length();i++) {
			
			ch =s.charAt(i);
			
			if(ch!=' ') {
				System.out.print(ch);
			}
		}

	}

}
