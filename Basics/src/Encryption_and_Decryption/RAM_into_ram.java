package Encryption_and_Decryption;

public class RAM_into_ram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="RAM KUMAR";
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
			{
				if((int)c[i]>=65 && (int) c[i]<=90)
				{
				c[i]=(char)(c[i]+32);
				System.out.print(c[i]);
				
				}
				else
				{
					System.out.print(' ');
				}
			}
		

	}

}
