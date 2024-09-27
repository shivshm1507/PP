package stringPro;

import java.util.Arrays;

public class HigestNumberInArray {
	

	public static void main(String[] args) {
		
		int max=0;
		
		int [] arr = {23,54,64,32,1000,9065,68,67,69,300000};
		
       for(int i=0;i<arr.length;i++) {
    	   
    	   if(arr[i]>max) {
    		   
    		   max=arr[i];
    	   }
       }
       
       System.out.println("Largest number is : "+max);
	}

}
