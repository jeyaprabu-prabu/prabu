package JCF_collections_api;

import java.util.Iterator;
import java.util.TreeSet;

public class Gettng_each_element_onme_by_one_using_iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts= new TreeSet<String>();
		ts.add("ram");
		ts.add("qwwerty");
		ts.add("xyz");
		ts.add("abc");
		System.out.println(ts);
		
		Iterator<String> itr = ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}

	}

}
