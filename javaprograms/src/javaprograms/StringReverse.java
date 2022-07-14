package javaprograms;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello", nstr = "";
		char ch;
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i); // extracts each character
			nstr = ch + nstr; // adds each character in front of the existing string
		}
		System.out.println("Reversed word: " + nstr);

	}

}
