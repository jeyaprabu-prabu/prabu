package Stringhomework;

public class Checking_if_z_is_present_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="malala got nobel prize!for peace in swizz";
		char c[]=new char[s.length()];
		boolean flag=false;
			for(int i=0; i<c.length; i++)
			{
			    c[i]=s.charAt(i);			
			}
		for(int i=0;  i< c.length ;i++)
    {
			if(c[i]=='z')
			{				
				flag=true;
			
		     }

	}System.out.print(flag);
	}

}
