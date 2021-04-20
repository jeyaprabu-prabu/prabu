package JCF;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList al=new LinkedList();
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		     al.add("mango");//string
		     al.add(5);//Integer
             al.add('a');//character
             al.add(7.77);//double
             System.out.println(al.isEmpty());
             System.out.println(al.size());
             System.out.println(al);
             al.add(0,"apple");//string
             System.out.println(al);
             al.remove("apple");//string
             System.out.println(al);
             al.remove(2);//string
             System.out.println(al);
             al.clear();//string
             System.out.println(al);

	}

}
