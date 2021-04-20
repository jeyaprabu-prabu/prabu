package Stringhomework;

public class Palindromme_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "malayalam";
		char c[] = new char[s.length()];
		for (int i = c.length - 1; i >= 0; i--) {
			c[c.length - 1 - i] = s.charAt(i);

		}
		String r = String.valueOf(c);

		if (s.equals(r)) {
			System.out.println("palindrome");

		} else {
			System.out.println("not a palindrome");
		}

	}
}
