package FileIO;

import java.io.FileWriter;
import java.io.IOException;

public class creating_tenfiles_diffcontent_samelocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
			for(int i=1; i<=10; i++)
			{
				FileWriter fw = new FileWriter("c:/users/sella muthu/desktop/New folder/ABC"+ i +".txt" );
				String s = (i+"---->"+(char)(65+i)+"\n");	
		    fw.write(s);
			fw.flush();
			fw.close();
			}
		} catch (IOException e) {
			System.out.println(e);
			// e.printStackTrace();
		}

	}

}
