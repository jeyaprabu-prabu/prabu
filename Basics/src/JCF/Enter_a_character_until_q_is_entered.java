package JCF;

import java.util.ArrayList;
import java.util.Scanner;

public class Enter_a_character_until_q_is_entered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList al=new ArrayList();
		Character c= ' ';
		while(c != 'q')
		{
			System.out.println("Enter a character:");
			c=sc.next().charAt(0);
			al.add(c);
		}
		System.out.println(al);
		

	}

}
