package String;

public class Search_and_replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="payilagam";
       char c[]=new char[s.length()];
       char search='a',replace='@';
       for(int i=0; i<c.length; i++)
       {
    	   c[i]=s.charAt(i);
    	   
    	   if(c[i]==search)
    	   {
    		   c[i]=replace;
    	   }System.out.print(c[i]);
       }
	}

}
