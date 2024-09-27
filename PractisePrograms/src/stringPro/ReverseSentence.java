package stringPro;

public class ReverseSentence {

	public static void main(String[] args) {
		
         String s = "I love Coding";
         
         String [] array = s.split(" ");
         
         for(int i=array.length-1;i>=0;i--) {
        	 
        	 System.out.print(array[i]+" ");
         }
	}

}
