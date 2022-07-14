package javaprograms;

public class SumOfPrimeNumbers {

	public static void main(String[] args) {

		int count, sum = 0, maxno=10;

		for (int number = 1; number <= maxno; number++) {
			count = 0;
			for (int i = 2; i <= number / 2; i++) {

				if (number % i == 0) {

					count++;
					break;
				}
			}

			if (count == 0 && number != 1) {
				// calculates the sum of prime numbers
				sum = sum + number;
			}
		}

		System.out.println("The Sum of Prime Numbers from 1 to "+maxno+ " is: " + sum);
	}
}
