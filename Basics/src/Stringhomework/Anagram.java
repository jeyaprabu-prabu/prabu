package Stringhomework;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="listen";
		char x[]=new char[s.length()];
		char c[]=new char[s.length()];
				
				for(int i=0; i<c.length; i++)
				{
				    c[i]=s.charAt(i);			
				}
			for(int i=0;  i< c.length ;i++)
	         {
				for(int j=i+1; j<c.length; j++)
				  {			
					if(c[i]==c[j])//remove duplicates
					{
						c[j]=0;
					}
					
					if(c[i]>c[j])//ascending order
				     {				
					char temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				      }
					
				  }
	         
	
				//System.out.print(c[i]);
	         String ss=String.valueOf(c[i]);
	         char r[]=ss.toCharArray();
	        
	         for(int k=0; k<c.length; k++){
	        	 for(int k1=0; k1<c.length; k1++){
	
	            if(r[i] ==x[k1] )
				{
					System.out.println("anagram");
				}
				else{
					System.out.println("not anagram");
				
	         }
	         
	         }
	         }  }
	}
}

