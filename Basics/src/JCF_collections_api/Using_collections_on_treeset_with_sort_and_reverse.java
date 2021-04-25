package JCF_collections_api;

import java.util.TreeSet;

public class Using_collections_on_treeset_with_sort_and_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("ram");
		ts.add("qwerty");
		ts.add("xyz");
		ts.add("abc");
		System.out.println(ts);
		TreeSet<String> rev = (TreeSet<String>) ts.descendingSet();
		System.out.println(rev);
		System.out.println(ts.contains("ijk"));
	}

}
