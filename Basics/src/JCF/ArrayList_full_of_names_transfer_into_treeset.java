package JCF;

import java.util.ArrayList;
import java.util.TreeSet;

public class ArrayList_full_of_names_transfer_into_treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("Prabhu");
		al.add("Prakash");
		al.add("Vijay");
		al.add("Lokesh");
		al.add("Santhosh");
		System.out.println(al);
		
	TreeSet ts= new TreeSet();
	ts.addAll(al);
	System.out.println(ts);
	
		

	}

}
