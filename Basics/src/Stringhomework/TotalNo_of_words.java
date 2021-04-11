package Stringhomework;

public class TotalNo_of_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="malala got nobel prize! for peace in swizz";
		char c[]=new char[s.length()];
		int count=0;

			for(int i=0; i<c.length; i++)
			{
			c[i]=s.charAt(i);
			if(' '==c[i])
			{
				 count=count+1;
			}
			
			}System.out.println(count+1);

}
}
