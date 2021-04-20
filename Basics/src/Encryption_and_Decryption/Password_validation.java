package Encryption_and_Decryption;

public class Password_validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a=false,b=false,d=false,e=false;
		String pass ="INDia@456";
		
		if(pass.length()>=8)
		{
			a=true;
		}
         char c[]=pass.toCharArray();
         for(int i=0; i<c.length;i++)
         {
        	 if(c[i]>='A' && c[i]<='Z')
        	 {
        		 b=true;
        		 
        	 }
        	 if(c[i]>='0' && c[i]<='9')
        	 {
        		 d=true;
        		 
        	 }
        	 if(c[i]>='a' && c[i]<='z')
        	 {
        		 e=true;
        		 
        	 }
         }
         if(!pass.contains(" "))
         {
        	 d=true;
         }
         if(a && b && d && e)
         {
        	 System.out.println("Valid Password");
         }
         else
         {
        	 System.out.println("In-Valid Password");
         }
         
	}

}
