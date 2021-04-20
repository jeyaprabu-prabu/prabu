package JCF_Mycollection;

import java.util.ArrayList;

public class Collections_of_collections_generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Homogenous - Generics - ensure type safety
		ArrayList<String> names = new ArrayList<String>();
		names.add("Volvo");
		names.add("Audi");
		names.add("BMW");
		names.add("Benz");
		System.out.println(names);
		// Homogenous - Generics - ensure type safety
		ArrayList<Integer> quantity = new ArrayList<Integer>();
		quantity.add(25);
		quantity.add(26);
		quantity.add(17);
		quantity.add(89);
		System.out.println(quantity);
		// Homogenous - Generics - ensure type safety
		ArrayList<Integer> year = new ArrayList<Integer>();
		year.add(1997);
		year.add(2001);
		year.add(2020);
		year.add(1967);
		System.out.println(year);
		
		// Hetrogeneous - collection of collections 
		ArrayList al = new ArrayList();
		al.add(names);
		al.add(quantity);
		al.add(year);
		System.out.println(al);
		System.out.println(al.get(0));
		System.out.println(al.get(1));

	}

}
