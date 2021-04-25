package JCF_Mymap;

import java.util.HashMap;

public class Example_pgm_for_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> zomato= new HashMap<Integer,String>();
		zomato.put(94492166,"ram");
		zomato.put(124335532,"ram");
		zomato.put(234235664,"Azar");
		zomato.put(94492166,"sam");//Update the old one
		System.out.println(zomato);
		
		
	}

}
