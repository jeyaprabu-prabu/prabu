package String;

public class sort_in_ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="azar";
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
					}
				System.out.print(c[i]); 
				
				
	         }
	}

}
