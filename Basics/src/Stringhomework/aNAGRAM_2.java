package Stringhomework;

public class aNAGRAM_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "listen";
		String s2 = "silent";
		String j1 = "";
		String j2 = "";
		
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();

		for (int i = 0; i < ch1.length; i++) {
			for (int j = i + 1; j < ch1.length; j++) {
				if (ch1[i] == ch1[j])// remove duplicates
				{
					ch1[j] = 0;
				}

				if (ch1[i] > ch1[j])// ascending order
				{
					char temp = ch1[i];
					ch1[i] = ch1[j];
					ch1[j] = temp;
				}
			}
		}

		// System.out.print(ch1[i]);

		// checking ch2
		for (int i1 = 0; i1 < ch2.length; i1++) {
			for (int j = i1 + 1; j < ch2.length; j++) {
				if (ch2[i1] == ch2[j])// remove duplicates
				{
					ch2[j] = 0;
				}

				if (ch2[i1] > ch2[j])// ascending order
				{
					char temp = ch2[i1];
					ch2[i1] = ch2[j];
					ch2[j] = temp;
				}
			}

			// System.out.print(ch2[i1]);

		}

		j2 = String.valueOf(ch2);
		j1 = String.valueOf(ch1);
		System.out.println(j1.equals(j2));

	}
}
