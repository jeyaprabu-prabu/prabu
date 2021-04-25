package JCF_Mycollection;

import java.util.ArrayList;

public class Removing_the_element_based_on_index_and_based_on_its_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList names = new ArrayList();
		names.add("Volvo");
		names.add("Audi");
		names.add("BMW");
		names.add("Benz");
		System.out.println(names+"\n");
		names.remove(2);
		names.remove("Benz");
		names.add(2,"Honda");
		System.out.println(names+"\n");
		System.out.println(names.indexOf("Bmw"));
		System.out.println(names.get(2));
		
		

	}

}
