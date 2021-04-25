package JCF_Mymap;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Set_to_Map_conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set doesnt have duplicates
				// In Map, Key doesnt have duplicates
				LinkedHashSet<String> l = new LinkedHashSet<String>();
				l.add("ajk");
				l.add("yui");
				l.add("vgh");
				l.add("erf");
				System.out.println(l);
				int counter =  1; 
				LinkedHashMap<String,Integer> h = new LinkedHashMap<String,Integer>();
		java.util.Iterator<String>  itr = l.iterator(); // Transfers control over all elements in the set for iteration
				for( ; itr.hasNext() ; ) // hasNext() gives true if next element is present in the set 
					// it gives false if next element is not present in the set 
				{
					h.put(itr.next(), counter); // next() gives the current element in the set 
					counter=counter+1; 
				}
				System.out.println(h);
	}

}
