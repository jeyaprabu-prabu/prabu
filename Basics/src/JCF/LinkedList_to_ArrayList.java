package JCF;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_to_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll= new LinkedList();
		ll.add("Prabhu");
		ll.add("Prakash");
		ll.add("Makesh");
		ll.add("Vijay");
		ll.add("Santhosh");
		ll.add("Prabhu");
		System.out.println(ll);
		
		
		ArrayList al=new ArrayList();
		al.addAll(ll);
		System.out.println(al);
		

	}

}
