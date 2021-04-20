package JCF;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSet_to_TreeSEt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		hs.add("Prabhu");
		hs.add("Prakash");
		hs.add("Lokesh");
		hs.add("Santhosh");
		hs.add("Mahesh");
		hs.add("Vijay");
		System.out.println(hs);
		
		TreeSet ts = new TreeSet();
		   ts.addAll(hs);
		   System.out.println(ts);
		   

	}

}
