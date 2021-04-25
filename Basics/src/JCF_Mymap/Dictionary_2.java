package JCF_Mymap;

import java.util.Scanner;
import java.util.TreeMap;

public class Dictionary_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,String> dictionary= new TreeMap<String,String>();
		dictionary.put("Acquiscence","conformity"+"\n");
		dictionary.put("Fanatical","uncompromising"+"\n");
		dictionary.put("Pensive","thoughtful"+"\n");
		dictionary.put("Respite","break"+"\n");
		dictionary.put("Discordant","disagreeing"+"\n");
		dictionary.put("Eloquent","expressive"+"\n");
		dictionary.put("Encompass","enclose"+"\n");
		dictionary.put("Impercebtible","undetectable"+"\n");
		System.out.println(dictionary+"\n");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter word need to be search:");
		String j=sc.next();
		System.out.println(dictionary.get(j));
	}

}
