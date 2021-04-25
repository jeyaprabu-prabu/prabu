package Stringhomework;

public class ANAHGRAM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "listen";
		String s2 = "silent";
		//String x = "";
		//String y = "";
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		if (c1.length == c2.length) {

			for (int i = 0; i < c1.length; i++) {
				for (int j = i + 1; j < c1.length; j++) {  

					if (c1[i] > c1[j])// ascending order
					{
						char temp = c1[i];
						c1[i] = c1[j];
						c1[j] = temp;
					}

					if (c2[i] > c2[j])// ascending order
					{
						char temp = c2[i];
						c2[i] = c2[j];
						c2[j] = temp;
					}

				}
			}
			String x = String.valueOf(c1);
			System.out.println(x);
			String y = String.valueOf(c2);
			System.out.println(y);
			if (x.equals(y))
			{
				System.out.println("anagram ");
			}
			else 
			{
				System.out.println("Not an anagram due to char set");
			}
		}else {
			System.out.println("Not an anagram due to size");

		}

	}

}
