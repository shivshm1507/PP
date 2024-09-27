package stringPro;
/*
 "StringIndexOutOfBoundsException" is thrown when any one of the following conditions is met.

--> if the start index is negative value
--> end index is lower than starting index.
--> Either starting or ending index is greater than the total number of characters present in the string.
  
 */

public class SubStringExample {

	public static void main(String[] args) {
		
		String s="Mallikarjun";
		String d = "";
		
		d=s.substring(1,9);
		System.out.println(d);

	}

}
