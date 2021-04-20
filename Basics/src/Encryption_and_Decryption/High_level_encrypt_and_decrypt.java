package Encryption_and_Decryption;

public class High_level_encrypt_and_decrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Secret code is FAFBFD";
		char c[] = s.toCharArray();

		for (int i = 0; i < c.length; i++)// Encryption
		{

			if (i % 2 == 0) {
				c[i] = (char) (c[i] + (i * 2 - i));
			} else {
				c[i] = (char) (c[i] - (i * 3 + i));
			}

			System.out.print(c[i]);
		}
		System.out.println();
		for (int i = 0; i < c.length; i++)// Decryption
		{

			if (i % 2 == 0) {
				c[i] = (char) (c[i] - (i * 2 - i));
			} else {
				c[i] = (char) (c[i] + (i * 3 + i));
			}

			System.out.print(c[i]);
		}

	}

}
