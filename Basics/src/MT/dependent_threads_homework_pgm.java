package MT;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class J extends Thread
{
synchronized public void run()
{
	String s="";
	try {
		sleep(100);
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
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
class P extends Thread
{
	synchronized  public void run()
{
	try {
		
		FileWriter fw = new FileWriter("c:/users/sella muthu/desktop/abc.txt");
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
public class dependent_threads_homework_pgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J a=new J();
		P b=new P();
		a.start();
		b.start();

	}

}
