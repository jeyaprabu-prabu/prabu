package JCF_Mycollection;

import java.util.ArrayList;
import java.util.Scanner;

public class Search_in_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList cars= new ArrayList();
      cars.add("Volvo");
      cars.add("Bmw");
      cars.add("Ford");
      cars.add("Mazda");
      //System.out.println(cars);
      ArrayList c= new ArrayList();
      for(int i=0; i< cars.size(); i++)
      {
    	  c.add(cars.get(i).toString().toLowerCase());
      }
      
      @SuppressWarnings("resource")
	Scanner sc= new Scanner(System.in);
      System.out.println("Enter Your Favourite car:");
      String s =sc.nextLine();
     // System.out.println(c.contains(s.toLowerCase()));
       System.out.println(c.remove(s.toLowerCase()));
      c.add(s.toLowerCase());
      System.out.println(c);
      

      
      
	}

}
