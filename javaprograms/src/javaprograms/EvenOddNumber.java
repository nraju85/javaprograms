package javaprograms;

public class EvenOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaring and initializing integer variable
		int num = 11;

		// Checking if number is even or odd number
		// via remainder
		if (num % 2 == 0) {

			// If remainder is zero then this number is even
			System.out.println("Entered Number " +num+ " is Even");
		}

		else {

			// If remainder is not zero then this number is
			// odd
			System.out.println("Entered Number " +num+ " is Odd");
		}
	}

}
