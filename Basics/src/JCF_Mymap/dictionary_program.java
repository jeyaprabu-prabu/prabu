package JCF_Mymap;

import java.util.Scanner;
import java.util.TreeMap;

public class dictionary_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,String> tm= new TreeMap<String,String>();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many words Wants to be added:");
		Integer n=sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			System.out.println("Enter the word:");
			String word=sc.next();
			System.out.println("Enter the meaning:");
			String meaning=sc.next();
			tm.put(word,meaning);
		}
		System.out.println(tm);
		System.out.println();
		System.out.println("Enter word need to be search:");
		String j=sc.next();
		System.out.println(tm.get(j));
	
		
	}

}
