package JCF_Mymap;

import java.util.Iterator;
import java.util.TreeSet;

public class Iterator_for_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Peacock");
		ts.add("Pigeon");
		ts.add("Hen");
		ts.add("Bustard");
		System.out.println(ts);
		Iterator<String> itr= ts.iterator();
		System.out.println("The iterated Set values are:");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
