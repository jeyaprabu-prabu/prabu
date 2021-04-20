package StringArray;

public class Mala_and_kamala_homework_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="mala and kamala are friends";
		String ss[]=s.split(" ");
		
		for(int i=0; i<ss.length; i++)
		{
			//int counter =0;
			if(ss[i].contains("a") )
			{
				//counter=counter+1;
				System.out.println(ss[i]);
				
			}
			  
		} 

	}

}
