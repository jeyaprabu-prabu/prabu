package Encryption_and_Decryption;

public class Low_level_encrypt_And_decrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Secret code is FAFBFD";
		char c[]=s.toCharArray();
		
		for(int i=0; i<c.length; i++)//Encryption 
		{
			c[i]=(char) (c[i] +1);
			System.out.print(c[i]) ;
		}
		
		System.out.println(    ) ;
		
		for(int i=0; i<c.length; i++)//Decryption
		{
			c[i]=(char) (c[i] -1);
			
			System.out.print(c[i]) ;
		}
	}

}
