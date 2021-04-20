package Encryption_and_Decryption;

public class Emilid_validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a=false,b=false,c=false,d=false;
		String email="jeyaprabu203@gmail.com";
		
		if(email.length() > 8)
		{
			a=true;
		}
		if(email.contains("@"))
		{
			b=true;
		}
		if(email.lastIndexOf('.')>=email.length()-4)
		{
			c=true;
		}
		/*if(email.length() > 8)
		{
			a=true;
		}*/
		if(a&&b&&c)
		{
			System.out.println("VALID EMAIL.ID");
		}
		else
		{
			System.out.println("INVALID EMAIL.ID");
		}

	}

}
