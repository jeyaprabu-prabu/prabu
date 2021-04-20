package StringArray;

public class Mala {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="mala and kamala are friends";		
		String s1="";
		String s2="";
		
		String ss[]=s.split(" ");
		
		
		
	
		 for(int i=0; i<=ss.length; i++)
		{
			 String word=ss[i];
			 
			 
			 char c[]=s.toCharArray();
			 for(int j=c.length-1; j>=0; j--)
			 {
				c[c.length-1-j]=s.charAt(j);
				//System.out.print(c[c.length-1-j]);	
				s1=s1+ c[c.length-1-j];
				}
			
			 s2=s2+s1+" ";
			} 
		 System.out.print(s2);
			

	}

}
