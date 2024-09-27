package stringPro;

/*The Java String class join() method returns a string joined with a given delimiter. 
 In the String join() method, the delimiter is copied for each element.
 
 NullPointerException if element or delimiter is null.
 */

public class StringJoinExample {

	public static void main(String[] args) {
		
	
		String str = String.join("/", "wake up ","hi","Hello");  
		System.out.println(str);  

	}

}
