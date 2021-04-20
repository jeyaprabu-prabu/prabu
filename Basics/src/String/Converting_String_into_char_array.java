package String;

public class Converting_String_into_char_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Narayanasamy resigns as pudhucherry cm after losing majority in assembly";
		String ss[]=s.split(" ");
		int counter =0;
		for(int i=0; i<ss.length; i++)
		{
			if(ss[i].contains("a") )
			{
				counter=counter+1;
			}
		}
       System.out.println(counter);
	}

}
