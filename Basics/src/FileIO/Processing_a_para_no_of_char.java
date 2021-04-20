package FileIO;

import java.io.FileReader;
import java.io.IOException;

public class Processing_a_para_no_of_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="";		
//		try {
//			FileReader fr = new FileReader("c:/users/sella muthu/desktop/New folder/prabhu.txt");
//			int i;
//			while ((i = fr.read()) != -1)
//			{
//	       s=s+(char)i;				
//			}
//			System.out.print(s);
//			System.out.println();
//			String ss[] = s.split(" ");
//		    int  c1=0;
//			for (int k = 0; k < ss.length; k++)
//			{
//				if(!ss[k].contains(" "))
//				{
//					c1=c1+ss[k].length();
//					//System.out.println(ss[k].length());				
//				}
//			}System.out.println("number of CHARACTERS==>"+c1);
//			fr.close();
		
		
		String s="";		
		try {
			FileReader fr = new FileReader("c:/users/sella muthu/desktop/New folder/prabhu.txt");
			int i;
			while ((i = fr.read()) != -1)
			{
	       s=s+(char)i;				
			}
			System.out.print(s);
		char c[] =s.toCharArray();
		
			System.out.println("number of CHARACTERS==>"+c.length);
			fr.close();

		} catch (IOException e) {
			System.out.println(e);
			// e.printStaclTrace();
		}

	}

}
