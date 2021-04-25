package Encryption_and_Decryption;

public class ram_into_RAM_conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ram kumar";
		char c[]=s.toCharArray();
	     for(int i=0;i<c.length;i++)
			{
				if((int)c[i]>=97 && (int) c[i]<=122)
				{
				c[i]=(char)(c[i]-32);
				System.out.print(c[i]);
				
				}
				else
				{
					System.out.print(' ');
				}
			}
		


	}

}
