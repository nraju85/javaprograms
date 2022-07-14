package javaprograms;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original, reverse = ""; // Objects of String class  
	    
	      original = "radar";   
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if (original.equals(reverse))  
	         System.out.println("Entered string "+original+ " is a palindrome.");  
	      else  
	         System.out.println("Entered string "+original+ " isn't a palindrome.");   
	}

}
