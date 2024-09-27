package stringPro;

public class StringSwipe {

	public static void main(String[] args) {

		String s1 ="Mallikarjun";
		String s2 = "Shivsharan";
		
		s1= s1+s2; //MallikarjunShivsharan

		System.out.println(s1);
		
		s2=s1.substring(0, s1.length()-s2.length());
		
		System.out.println("S2 :"+s2);
		s1=s1.substring(s2.length());
		System.out.println("s1 :"+s1);
		
	}

}
