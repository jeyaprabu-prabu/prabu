package JCF_Mycollection;

import java.util.ArrayList;
import java.util.Scanner;

public class add_and_remove_particular_index_of_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList names = new ArrayList();
		names.add("Volvo");
		names.add("Audi");
		names.add("BMW");
		names.add("Benz");
		System.out.println(names+"\n");
		
		//adding an element
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the element Wants to be added:");
		String s=sc.nextLine();
		names.add(s);
		System.out.println(names+"\n");
		
		//Removing an element
		System.out.println("Enter the index Wants to be removed:");
		int a=sc.nextInt();
		names.remove(a);
		System.out.println(names);
		
	}

}
