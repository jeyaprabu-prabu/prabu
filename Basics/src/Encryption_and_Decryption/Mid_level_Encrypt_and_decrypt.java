package Encryption_and_Decryption;

public class Mid_level_Encrypt_and_decrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Secret code is FAFBFD";
		char c[]=s.toCharArray();
		
		for(int i=0; i<c.length; i++)//Encryption 
		{
			
	           if(i % 2 == 0)
	           {
	        	   c[i]=(char) (c[i] +i);
	           }
	           else
	           {
	        	   c[i]=(char) (c[i] -i); 
	           }
			
			System.out.print(c[i]) ;
		}
		System.out.println( ) ;
		for(int i=0; i<c.length; i++)//Decryption 
		{
			
	           if(i % 2 == 0)
	           {
	        	   c[i]=(char) (c[i] -i);
	           }
	           else
	           {
	        	   c[i]=(char) (c[i] +i); 
	           }
			
			System.out.print(c[i]) ;
		}

	}

}
