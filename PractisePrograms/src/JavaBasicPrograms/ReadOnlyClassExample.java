/*A class can be made read-only by making all of the fields private.  
 * The read-only class will have only getter methods which return the private property of the class 
 * to the main method. 
 * We cannot modify this property because there is no setter method available in the class. 
 * Consider the following example.*/

package JavaBasicPrograms;

class Student {

	private String collegeName = "SVERI";

	public String getCollegeName() {

		return collegeName;
	}
}

class ReadOnlyClassExample {
	public static void main(String args[]) {

		Student a = new Student();
		a.getCollegeName();
		System.out.println(a.getCollegeName());
	}
}