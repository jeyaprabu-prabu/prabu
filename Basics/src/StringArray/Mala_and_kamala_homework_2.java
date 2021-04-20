package StringArray;

public class Mala_and_kamala_homework_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String s = "mala and kamala are friends";
		// String ss[] = s.split(" ");
		//
		// for (int i = 0; i < ss.length; i++) {
		// int count = 0;
		// String c = ss[i];
		// for (int j = 0; j < c.length(); j++) {
		// count = count + 1;
		// }
		// System.out.println(c + " --->" + count);
		// }

		String s = "mala and kamala are friends";
		String ss[] = s.split(" ");
		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i] + " --->" + ss[i].length());
		}
	}
}
