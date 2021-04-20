package FileIO;

import java.io.FileReader;
import java.io.IOException;

public class number_of_lines_in_a_para {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "";
		try {
			FileReader fr = new FileReader("c:/users/sella muthu/desktop/New folder/prabhu.txt");
			// int i;
			// while ((i = fr.read()) != -1) {
			// s = s + (char) i;
			// }
			// System.out.print(s);
			// System.out.println();
			// String ss[] = s.split(" ");
			//
			// int count = 0;
			// for (int k = 0; k < ss.length; k++) {
			// if (ss[k].contains(".")) {
			// count = count + 1;
			//
			// }
			//
			// }

			int i;
			while ((i = fr.read()) != -1) {
				s = s + (char) i;
			}
			System.out.print(s);
			String ss[] = s.split("\n");
			int count = ss.length;
			System.out.println("\n Number of LINES:" + (count));
			fr.close();

		} catch (IOException e) {
			System.out.println(e);
			// e.printStaclTrace();
		}

	}

}
