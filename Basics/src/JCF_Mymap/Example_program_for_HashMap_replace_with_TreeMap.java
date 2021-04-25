package JCF_Mymap;

import java.util.HashMap;
import java.util.TreeMap;

public class Example_program_for_HashMap_replace_with_TreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> zomato= new TreeMap<Integer,String>();
		zomato.put(678,"Azar");
		zomato.put(999,"Azar");
		zomato.put(123,"Ram");
		zomato.put(132,"sam");
		zomato.put(321,"Azar");//duplicate in key is not allowed
		zomato.put(321,"Zara");//duplicate in value is allowed
		System.out.println(zomato);
		

	}

}
