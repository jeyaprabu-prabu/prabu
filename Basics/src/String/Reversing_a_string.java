package String;

public class Reversing_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="Abhraham";
        char c[]=new char[s.length()];
        for(int i=c.length-1;i>=0; i--)
        {
        	c[c.length-1-i]=s.charAt(i);
        	System.out.print(c[c.length-1-i]);
        }
  
	}

}
