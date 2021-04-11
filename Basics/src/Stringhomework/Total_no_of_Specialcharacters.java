package Stringhomework;

public class Total_no_of_Specialcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="malala got nobel prize! for peace in swizz";
		char c[]=new char[s.length()];
		int count=0;

			for(int i=0; i<c.length; i++)
			{
			c[i]=s.charAt(i);
			if(c[i]<=65)
			{
				 count=count+1;
			}
			
			}System.out.println(count);

}

	}


