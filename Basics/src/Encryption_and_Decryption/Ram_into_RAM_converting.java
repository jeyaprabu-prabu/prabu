package Encryption_and_Decryption;

public class Ram_into_RAM_converting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Ram kumAr";
		char c[]=s.toCharArray();
		{
			for(int i=0;i<c.length;i++)
			{
				if(c[i]>=65 &&c[i]<=90)
				{
				System.out.print(c[i]);
				
			  }else{
				  
			  
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

	}

}
