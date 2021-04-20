package JCF_Mycollection;

import java.util.ArrayList;

public class convert_array_into_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s={"Prabhu" ,"Prkash","santhosh","lokesh","prabhakar"};
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("ram");
		al.add("ravana");
		for(String i: s)
		
		al.add(i);
		
		System.out.println(al);
			
			
		

	}

}
