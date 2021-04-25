package JCF_Mycollection;

import java.util.ArrayList;

public class Reversing_an_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("Prabhu");
		al.add("Prakash");
		al.add("Vijay");
		al.add("Lokesh");
		al.add("Santhosh");
		System.out.println(al);
		Object[] a;
		for(int i=al.size()-1; i>=0; i--){
			//al.add(a[i]);
			System.out.println(al.get(i));
		}

	}

}
