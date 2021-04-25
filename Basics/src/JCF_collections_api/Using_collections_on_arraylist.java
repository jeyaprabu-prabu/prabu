package JCF_collections_api;

import java.util.ArrayList;
import java.util.Collections;

public class Using_collections_on_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Collections is a predefined class in JAVA
				// Present in java.util package
				// Collections provides many functions to manipulate collection(List, Set, Map & Queue)
				// Collections is for Collection 
				ArrayList<String> names = new ArrayList<String>();
				names.add("Volvo");
				names.add("Audi");
				names.add("BMW");
				names.add("Benz");
				System.out.println(names);
				Collections.sort(names);
				System.out.println(names);
				System.out.println(Collections.binarySearch(names, "i10"));
				Collections.reverse(names);
				System.out.println(names);

	}

}
