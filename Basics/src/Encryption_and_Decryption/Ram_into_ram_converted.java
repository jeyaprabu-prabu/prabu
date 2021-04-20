package Encryption_and_Decryption;

public class Ram_into_ram_converted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Ram KumAr";
		char c[]=s.toCharArray();
		
			for(int i=0;i<c.length;i++)
			{
				if(c[i]>=65 &&c[i]<=90)
				{
					c[i]=(char)(c[i]+32);
				System.out.print(c[i]);
				
			     }
				else
				{			  
			  
				if((int)c[i]>=97 && (int) c[i]<=122)
				{
				
				System.out.print(c[i]);
				
				}
				else
				{
					System.out.print(' ');
				}
			}
		}

	}

}
