package FileIO;


import java.io.FileWriter;
import java.io.IOException;

public class WriteOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileWriter fw = new FileWriter("c:/users/sella muthu/desktop/xyz.txt",true);
			String s="Jeya prabhu";
			fw.write(s);
			fw.flush();
			fw.close();

		} catch (IOException e) {
			System.out.println(e);
			// e.printStaclTrace();
		}
	}
}
	


