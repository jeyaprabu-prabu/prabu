package JCF_Mymap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterator_for_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("Hero");
		al.add("Pulsar");
		al.add("Honda");
		al.add("Tvs");
		al.add("Yamaha");
		System.out.println(al);
		Iterator itr= al.iterator();
		System.out.println("The iterated List values are:");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
