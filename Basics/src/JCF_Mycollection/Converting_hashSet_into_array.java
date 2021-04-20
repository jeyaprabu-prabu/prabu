package JCF_Mycollection;

import java.lang.reflect.Array;
import java.util.HashSet;

public class Converting_hashSet_into_array {

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
		hs.add("Prabhu");
		
		Object[] a =hs.toArray();
	
		for(int i=0; i<hs.size();i++)
	{
		System.out.println(a[i]);
		}
	
	

	}

}
