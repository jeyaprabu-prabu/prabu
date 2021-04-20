package String;

public class Converting_collectionofstring_into_char_seperate_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Narayanasamy resigns as pudhucherry cm after losing majority an assembly";
		String ss[]=s.split("a");
		/*int counter =0;
		for(int i=0; i<ss.length; i++)
		{
			if(ss[i].contains("a") )
			{
				counter=counter+1;
			}
		}
       System.out.println(counter);*/

       //for(int j=0; j<ss.length; j++)
		for(String j : ss)
       {
    	   System.out.println(j);
       }
	}

}

