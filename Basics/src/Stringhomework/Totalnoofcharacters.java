package Stringhomework;

public class Totalnoofcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="malala got nobel prize! for peace in swizz";
		int count=0;
		char c[]=new char[s.length()];
		for(int i=0; i<c.length; i++)
		{
		c[i]=s.charAt(i);
		if(' '==c[i])
		{
			 count=count+1;
		}
		
		}//System.out.println(count);
	
		System.out.println(s.length()-count);
		

	}

}
