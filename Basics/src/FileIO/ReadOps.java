package FileIO;

import java.io.FileReader;
import java.io.IOException;

public class ReadOps{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="";
		try {
			FileReader fr = new FileReader("c:/users/sella muthu/desktop/abc.txt");
			int i;
			
			while ((i = fr.read()) != -1)
			{
				
				s=s+(char)i;
				
			}
			System.out.print(s);
			fr.close();

		} catch (IOException e) {
			System.out.println(e);
			// e.printStaclTrace();
		}

	}

}
