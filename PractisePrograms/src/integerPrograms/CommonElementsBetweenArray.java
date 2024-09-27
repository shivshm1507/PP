package integerPrograms;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsBetweenArray {

	public static void main(String[] args) {

		Set<Integer> s1 = new HashSet<>();
		Set<Integer> commonElements = new HashSet<>();

		int[] arr1 = { 1, 2, 3, 4, 5, 5};
		int[] arr2 = { 5, 6, 7, 8, 9, 4,3 };

		for (int n : arr1) {
          s1.add(n);
		}
		
		for(int n1 : arr2) {
			
			if(s1.contains(n1)) {
				
				commonElements.add(n1);
			}
		}
		
		System.out.println(commonElements);
	}

}
