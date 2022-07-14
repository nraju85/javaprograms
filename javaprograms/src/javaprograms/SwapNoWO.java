package javaprograms;

public class SwapNoWO {

	// Swap no without using 3rd variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 5;
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swapping:" + " x = " + x + ", y = " + y);
	}

}
