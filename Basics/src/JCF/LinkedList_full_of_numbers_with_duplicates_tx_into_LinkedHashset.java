package JCF;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedList_full_of_numbers_with_duplicates_tx_into_LinkedHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          LinkedList ll=new LinkedList();
          ll.add(2);
          ll.add(4);
          ll.add(6);
          ll.add(1);
          ll.add(9);
          ll.add(2);
          
          System.out.println(ll);
          
          LinkedHashSet lhs= new LinkedHashSet();
          lhs.addAll(ll);
          System.out.println(lhs);
          
          
	}

}
