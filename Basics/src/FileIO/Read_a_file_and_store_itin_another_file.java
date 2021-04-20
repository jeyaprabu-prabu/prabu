package FileIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read_a_file_and_store_itin_another_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="";
		try {
			FileReader fr = new FileReader("c:/users/sella muthu/desktop/ABC.txt");
			int i;
			while ((i = fr.read()) != -1)
			{		
				s=s+(char)(i);				
			}System.out.print(s);
		//fr.close();
			FileWriter fw = new FileWriter("c:/users/sella muthu/desktop/New folder/xyz.txt");
		    fw.write(s);
			fw.flush();
			fw.close();
			fr.close();
		}
	 catch (IOException e) {
		System.out.println(e);
		// e.printStaclTrace();
	}
	}

}
