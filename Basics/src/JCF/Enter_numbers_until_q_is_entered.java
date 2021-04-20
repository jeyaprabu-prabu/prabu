package JCF;

import java.util.ArrayList;
import java.util.Scanner;

public class Enter_numbers_until_q_is_entered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		ArrayList al=new ArrayList();
		Character j=1 ;
		while(j != 'q')
		{
			System.out.println("Enter a Number:");
			j=   sc.next().charAt(0);
			al.add(j);
		}
		System.out.println(al);

	}

}
