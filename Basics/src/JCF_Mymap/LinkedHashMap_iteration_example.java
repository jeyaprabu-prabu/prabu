package JCF_Mymap;

import java.util.LinkedHashMap;

public class LinkedHashMap_iteration_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Integer, Integer> y = new LinkedHashMap<Integer, Integer>();

		y.put(1, 43557);
		y.put(2, 5678);
		y.put(3, 3456);
		y.put(4, 345);
		// System.out.println(lhm);
		// using keySet() for iteration over keys
		for (Integer key : y.keySet())
			System.out.println("key --- > " + key);
		// using values() for iteration over values
		for (Integer value : y.values())
			System.out.println("value --- > " +value );
		// Here values are objects of Integer class

	}

}
