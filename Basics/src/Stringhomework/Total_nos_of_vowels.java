package Stringhomework;

public class Total_nos_of_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="malala got nobel prize!for peace in swizz ";
char c[]=new char[s.length()];
int count=0;

	for(int i=0; i<c.length; i++)
	{
	c[i]=s.charAt(i);
	
	}
for(int i=0;  i< c.length ;i++)
    {
	if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
	{
		count =count+1;
		
	}
}System.out.print(count);
	}

}
