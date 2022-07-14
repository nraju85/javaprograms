//Find a Smallest/Minimum number in a given array
package javaprograms;

public class SmallestNumber {
	static int arr[] = { 10, 20, 30, 40, 50 };

	static int largest() {
		int i;

		// Initialize maximum element
		int max = arr[0];

		// Traverse array elements from second and
		// compare every element with current max
		for (i = 1; i < arr.length; i++)
			if (arr[i] < max)
				max = arr[i];

		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Largest in given array is " + largest());

	}

}
