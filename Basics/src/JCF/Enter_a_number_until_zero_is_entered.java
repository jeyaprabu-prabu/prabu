package JCF;

import java.util.ArrayList;
import java.util.Scanner;

public class Enter_a_number_until_zero_is_entered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList al=new ArrayList();
		Integer i=1 ;
		while(i != 0)
		{
			System.out.println("Enter a Number:");
			i= sc.nextInt();
			al.add(i);
		}
		System.out.println(al);
		

	}

}
