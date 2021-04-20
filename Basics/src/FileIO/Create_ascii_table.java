package FileIO;

import java.io.FileWriter;
import java.io.IOException;

public class Create_ascii_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="";
		try {
			FileWriter fw = new FileWriter("c:/users/sella muthu/desktop/ASCII.txt");
			for(int i=1; i<=127; i++)
			{
				s = (i+"---->"+(char)i +"\n");
				fw.write(s);
			}
			fw.flush();
			fw.close();

		} catch (IOException e) {
			System.out.println(e);
			// e.printStaclTrace();
		}
	}
	}

	



