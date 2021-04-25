package JCF_Mymap;

public class rough_sheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1 = new Students("Ram", 123, 'A', 55.0);
		Students s2 = new Students("Sam", 233, 'B', 65.0);
		Students s3 = new Students("Jam", 563, 'C', 75.0);
		Students s4 = new Students("Mam", 903, 'A', 55.0);

		LinkedHashMap<Integer, Students> lhm = new LinkedHashMap<Integer, Students>();

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
			System.out.println("value: " + value.name + " " + value.rollNo + " " + value.total + " " + value.grade);
		// Here values are objects of Students class
		
		
		
		LinkedHashMap<Integer, Integer> y = new LinkedHashMap<Integer, Integer>();

		y.put(1, 435576896);
		y.put(2, 567899868);
		y.put(3, 345656);
		y.put(4, 345);
		// System.out.println(lhm);
		// using keySet() for iteration over keys
		for (Integer key : y.keySet())
			System.out.println("key --- > " + key);
		// using values() for iteration over values
		for (Integer value : y.values())
			System.out.println("value --- > " +value );
		// Here values are objects of Integer class
	}

}
