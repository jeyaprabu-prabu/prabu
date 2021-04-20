package String;

public class Find_first_mid_last_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s="JEYAPRABu";
   System.out.println("First character:"+s.charAt(0));//first character
   
   if(s.length()%2==0)//middle character
   {
	   System.out.println("middle character:"+s.charAt(s.length()/2));
	   System.out.println("middle character:"+s.charAt(s.length()/2 - 1));
   }
   else
   {
	   System.out.println("middle character:"+s.charAt(s.length()/2));
   }
   System.out.println("last character:"+s.charAt(s.length()-1));//last character
	}

}
