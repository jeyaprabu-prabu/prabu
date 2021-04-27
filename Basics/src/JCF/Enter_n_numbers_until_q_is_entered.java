package JCF;

import java.util.ArrayList;
import java.util.Scanner;

public class Enter_n_numbers_until_q_is_entered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<String> al= new ArrayList();
	Scanner sc= new Scanner(System.in);
	String s=" ";
	while(! s.equalsIgnoreCase("q"));
	{
		System.out.println("Enter:");
		s=sc.nextLine();
		char c[]=s.toCharArray();
		int counter=0;
		for(int i=0; i<c.length; i++)
		{
			if(c[i] >=0 && c[i] <= 9)
			{
				counter= counter +1;
			}
		}
		if(counter == c.length)
		{
			al.add(s);
		}
		System.out.println(al);
	}

	}

}
