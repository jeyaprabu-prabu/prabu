package FileIO;

import java.io.FileReader;
import java.io.IOException;

public class number_of_words_in_para {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="";
		try {
			FileReader fr = new FileReader("c:/users/sella muthu/desktop/New folder/prabhu.txt");
			int i;
			while ((i = fr.read()) != -1)
			{
	       s=s+(char)i;				
			}
			System.out.print(s);
			System.out.println();
			String ss[] = s.split(" ");
			
			int count=0;
			for (int k = 0; k < ss.length; k++)
			{
				if(!ss[k].equals(" "))
				{
					count=count+1;					
						
				}
				
			}System.out.print("Number of words:"+(count)+"\n");
			System.out.print("Number of SPACES:"+(count-1));
			
			fr.close();

		} catch (IOException e) {
			System.out.println(e);
			// e.printStaclTrace();
		}


	}

}
