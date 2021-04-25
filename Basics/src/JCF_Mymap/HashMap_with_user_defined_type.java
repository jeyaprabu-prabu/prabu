package JCF_Mymap;

import java.util.*;
class Students
{
	String name;
	int rollno;
	char grade;
	double percentage;
	
	
	public Students(String name,int rollno, char grade, double percentage){
		this.name=name;
		this.rollno=rollno;
		this.grade=grade;
		this.percentage=percentage;		
		}
}
public class HashMap_with_user_defined_type {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, Students> lhm = new LinkedHashMap<Integer, Students>();		
		Students s1 = new Students ("Ram", 123, 'A', 55.0);
		Students s2 = new Students("Sam", 233, 'B', 65.0);
		Students s3 = new Students("Jam", 563, 'C', 75.0);
		Students s4 = new Students("Mam", 903, 'A', 55.0);		

		lhm.put(100, s1);
		lhm.put(101, s2);
		lhm.put(102, s3);
		lhm.put(109, s4);
		// System.out.println(lhm);
		// using keySet() for iteration over keys
		for (Integer key : lhm.keySet())
			System.out.println("key --- > " + key);
		// using values() for iteration over values
		for (Students value : lhm.values())
			System.out.println("value: " + value.name + " " + value.rollno + " "+ value.grade+" "+value.percentage);
		// Here values are objects of Students class
		
	}

}



