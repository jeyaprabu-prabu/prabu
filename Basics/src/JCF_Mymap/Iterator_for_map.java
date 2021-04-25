package JCF_Mymap;

import java.util.HashMap;

public class Iterator_for_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> zomato= new HashMap<Integer,String>();
		zomato.put(94492166,"ram");
		zomato.put(124335532,"ram");
		zomato.put(234235664,"Azar");
		zomato.put(94492166,"sam");//Updating the old one
		System.out.println(zomato+"\n");
		System.out.println("The iterated map values are:");
		
		///using iterator for map
				for (Integer key : zomato.keySet())
					System.out.println("key --- > " + key);				
				for (String value : zomato .values())
					System.out.println("value --- > " +value );
				


	}

}
