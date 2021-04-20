package StringArray;

public class Mala_and_kamala_homework_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String s = "mala and kamala are friends";
		// String ss[] = s.split(" ");
		// String s1 = "";
		// for (int i = 0; i < ss.length; i++) {
		// String c = ss[i];
		// String c1 = "";
		// for (int j = c.length() - 1; j >= 0; j--) {
		// c1 = c1 + c.charAt(j);
		// }
		// s1 = s1 + c1 + " ";
		// }
		// System.out.println(s1);

		String s = "mala and kamala are friends";
		String ss[] = s.split(" ");
		for (int i = 0; i < ss.length; i++) {
			char c[] = ss[i].toCharArray();
			for (int j = c.length - 1; j >= 0; j--) {
				System.out.print(c[j]);
			}
			System.out.print(" ");
		}
	}
}