package Stringhomework;

public class Unique_characters_in_ascending_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="malala got nobel prize!for peace in swizz";
		char c[]=new char[s.length()];
		
			for(int i=0; i<c.length; i++)
			{
			    c[i]=s.charAt(i);			
			}
		for(int i=0;  i< c.length ;i++)
             {
			for(int j=i+1; j<c.length; j++)
			    {			
				if(c[i]>c[j])//ascending order
			{				
				char temp=c[i];
				c[i]=c[j];
				c[j]=temp;		
		    }
				if(c[i]==c[j])//remove duplicates
				{
					c[i]=' ';	
					
				}
				}String str=String.valueOf(c[i]);
						
						System.out.print(str.replaceAll(" ", ""));	
          }
	}
}